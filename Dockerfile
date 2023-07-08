FROM openjdk:17-oracle
MAINTAINER MGB
COPY target/CONLAB-0.0.1-SNAPSHOT.jar  conlab-app.jar
ENTRYPOINT ["java","-jar","/conlab-app.jar"]