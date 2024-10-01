
# Build the application
FROM maven:3.9.9-eclipse-temurin-17 AS build
RUN mkdir -p /app
COPY . /app
WORKDIR /app
RUN mvn package -DskipTests

# Create slim image
FROM openjdk:21-jdk
LABEL authors="gerardo"
EXPOSE 8080
COPY --from=build /app/target/*.jar /app.jar
# Start the app
CMD [ "java", "-jar", "./app.jar" ]