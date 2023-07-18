FROM openjdk:17
VOLUME /tmp
ADD ./target/springboot-ms-items-0.0.1-SNAPSHOT.jar springboot-ms-items.jar
ENTRYPOINT ["java", "-jar", "/springboot-ms-items.jar"]