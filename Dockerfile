FROM adoptopenjdk:17-jdk-hotspot
MAINTAINER MGB
COPY target/CONLAB-0.0.1-SNAPSHOT.jar  conlab-app.jar
ENTRYPOINT ["java","-jar","/conlab-app.jar"]