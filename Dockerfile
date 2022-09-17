FROM amazoncorretto:17.0.4
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]