FROM  openjdk:17.0.1-jdk-slim

VOLUME /tmp
COPY target/**.jar C:/Users/admin/Videos/website_resume/target/ website_resume-0.0.1-SNAPSHOT.jar/
ENTRYPOINT ["java","-jar"," website_resume-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080