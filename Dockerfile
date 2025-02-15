# Use a base image for JDK 21 (since you're using Java 21)
FROM --platform=linux/amd64 openjdk:21-jdk-slim

# Expose the application's port (replace "8080" with your Spring Boot app's port if it's different)
EXPOSE 8080
# Copy the application JAR file into the container image
ADD build/libs/*SNAPSHOT.jar ecommerce-app.jar

# Start the application
ENTRYPOINT ["java", "-jar", "/ecommerce-app.jar"]