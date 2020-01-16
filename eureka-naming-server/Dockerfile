FROM openjdk:8-jdk-alpine3.9

WORKDIR app/

COPY target/eureka-naming-server-0.0.1-SNAPSHOT.jar app.jar

COPY src/main/resources/application.yml application.yml

EXPOSE 8762

ENTRYPOINT ["java", "-jar", "app.jar"]

