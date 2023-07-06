FROM amazoncorretto:11-alpine-jdk
MAINTAINER MGB
COPY target/CONLAB-0.0.1-SNAPSHOT.jar  conlab-app.jar
ENTRYPOINT ["java","-jar","/conlab-app.jar"]