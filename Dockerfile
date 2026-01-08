FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY src ./src

RUN mkdir bin && javac -d bin $(find src -name "*.java")

CMD ["java", "-cp", "bin", "application.Program"]
