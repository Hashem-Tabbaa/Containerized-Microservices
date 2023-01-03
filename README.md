
# Containerized Microservices (Docker) 

containerized microservices using docker, where each of the microservices stands independently. The interaction of the containerized microservices forms a temperature analytics website application, where users can enter temperatures based on different locations, and view the analysis of the temperature values based on the locations.



## System Architecture
The below figure visualizes how each microservice is going to interact with other microservices.
![System Architecture](https://github.com/Hashem-Tabbaa/Containerized-Microservices/blob/master/microservice%20structure.png?raw=true)

## Microservices Description
### Authentication Service
As the figure demonstrates, the system has 6 microservices, which are described as follows:

- Authentication Microservice:
    
    Which is a Java web service that is build using Spring Boot framework to be used by 2  other microservices (Show-Results, Enter-Data) to authenticate users.

- Enter Data Microservice:

    Which is a Spring Boot web application, where you can login and be authenticated by the authentication service, to be able to enter temperature statistics, that will be stored in MySQL database service.

-
## Docker
The docker-compose file is the file where we define the services of the system and configure 
them. And then we can run the whole system by one command “docker-compose up”.

All of the defined 6 services including the java applications and databases, will running inside a Bridge docker network, which will allow the containers to communicate with each other using the container name and port number of the container.
