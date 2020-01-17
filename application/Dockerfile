FROM openjdk:8-jdk-alpine

WORKDIR app/

COPY target/application-0.0.1-SNAPSHOT.jar app.jar

COPY src/main/resources/application.yml application.yml

EXPOSE 8181

ENTRYPOINT ["java", "-jar", "app.jar"]