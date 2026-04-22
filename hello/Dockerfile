# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-ea-21-jdk-slim-buster

# Set the working directory in the container
WORKDIR /app

# Copy the build output from Gradle into the container
COPY build/libs/*.jar app.jar

EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]