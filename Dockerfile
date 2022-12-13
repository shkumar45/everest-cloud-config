FROM amazoncorretto:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloud-config.jar
ENTRYPOINT ["java", "-jar", "/cloud-config.jar"]
EXPOSE 8888