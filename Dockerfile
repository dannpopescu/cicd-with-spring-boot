FROM openjdk:14-alpine

EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]

ARG JAR_FILE=target/cicd-with-spring-boot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

