FROM openjdk:8
MAINTAINER keerthi@test.com
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar 
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]