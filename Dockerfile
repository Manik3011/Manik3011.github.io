FROM  openjdk:17.0.1-jdk-slim

VOLUME /tmp
COPY target/website_resume-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","website_resume-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080