package com.atypon.showResults.controllers;


import com.atypon.showResults.model.AnalysisMongo;
import com.atypon.showResults.services.AnalysisService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class AnalysisController {

    private final AnalysisService analysisService;

    @GetMapping("/results")
    public String getAnalysis(Model model, HttpServletRequest request) {
        if(request.getSession().getAttribute("username") == null){
            return "redirect:/login";
        }
        //get analysis from the database using the analysis service
        model.addAttribute("analysis_values", analysisService.getAnalysis());

        // AnalysisMongo is the model class for the analysis values
        model.addAttribute("analysis", new AnalysisMongo());

        return "results";
    }
}
