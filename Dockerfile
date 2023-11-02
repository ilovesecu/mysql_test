FROM openjdk:17-oracle
EXPOSE 9094
ENV USE_PROFILE dev
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=${USE_PROFILE}","-jar", "/app.jar"]