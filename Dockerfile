# Etapa 1: Construir la aplicación usando Maven
FROM maven:3.8-openjdk-17-slim AS build

# Copiar el archivo pom.xml y el código fuente
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Ejecutar Maven para construir el .jar
RUN mvn clean package -DskipTests

# Etapa 2: Crear la imagen final que ejecutará el .jar
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo .jar desde la etapa anterior
COPY --from=build /app/target/aquaguard-backend-0.0.1-SNAPSHOT.jar /app/aquaguard-backend.jar

# Exponer el puerto en el que la aplicación escuchará
EXPOSE 8080

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/aquaguard-backend.jar"]
