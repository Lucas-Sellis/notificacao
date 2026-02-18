FROM gradle:8-jdk21 AS build
WORKDIR /app

COPY . .
RUN gradle build --no-daemon

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app

COPY --from=build /app/build/libs/*.jar notificacao.jar

EXPOSE 8082
CMD ["java", "-jar", "notificacao.jar"]

