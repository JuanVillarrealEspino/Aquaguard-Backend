# Usa una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Copia el archivo JAR generado en el contenedor
COPY target/aquaguard-backend-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que tu aplicación Spring Boot va a correr (por defecto 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
