FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY sample-app/target/sample-app-1.0-SNAPSHOT-spring-boot.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
