# Stage 1 - Build
FROM eclipse-temurin:17-jdk-jammy as builder
WORKDIR /build
COPY . .
RUN ./mvnw clean package -DskipTests

# Stage 2 - Runtime
FROM eclipse-temurin:17-jdk-jammy
COPY --from=builder /build/target/cvc-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
