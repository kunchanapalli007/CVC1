# Start from the official OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set working directory in container
WORKDIR /app

# Copy the built jar file into the container
COPY target/*.jar app.jar

# Expose the app's port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
