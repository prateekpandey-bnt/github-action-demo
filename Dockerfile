FROM openjdk:17-alpine
WORKDIR /opt
ENV port 8080
EXPOSE 8080
COPY target/springboot-github-action.jar /opt/springboot-github-action.jar
ENTRYPOINT exec java $JAVA_OPTS -jar springboot-github-action.jar