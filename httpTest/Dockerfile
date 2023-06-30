FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar httpTest.jar
ENTRYPOINT ["java","-jar","/httpTest.jar"]
EXPOSE 8080