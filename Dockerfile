FROM openjdk:17-oracle
# ENV SPRING_PROFILES_ACTIVE=prod 스프링 부트 환경변수도 설정 가능 #
COPY /build/libs/test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]