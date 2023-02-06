FROM maven AS MAVEN_BUILD

MAINTAINER xurshidbek2504@gmail.com

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn clean package

FROM altairbob/jdk-17-sshd

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/*.jar /app/appForDocker.jar

EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/app/appForDocker.jar"]