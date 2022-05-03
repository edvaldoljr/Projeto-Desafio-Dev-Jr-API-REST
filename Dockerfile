#FROM maven:3.8.1-openjdk-11 AS build
#COPY /src /app/src
#COPY /pom.xml /app
#RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip
#
#FROM openjdk:11-jdk-oracle
#EXPOSE 8080
#COPY --from=build /app/target/*.jar app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
FROM openjdk

WORKDIR /app

COPY target/API-REST-0.0.1-SNAPSHOT.jar /app/API-REST-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "API-REST-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080