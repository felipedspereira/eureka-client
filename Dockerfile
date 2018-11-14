FROM openjdk:8-jdk-alpine
MAINTAINER Felipe Pereira <felipe@prodam.am.gov.br>
VOLUME /tmp
ADD target/webtest.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]