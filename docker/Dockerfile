FROM adoptopenjdk/openjdk8:ubi

COPY SimpleInterestService/target/SimpleInterestService-0.0.1-SNAPSHOT.jar SimpleInterestService/SimpleInterestService-0.0.1-SNAPSHOT.jar

WORKDIR SimpleInterestService

EXPOSE 8080

CMD java -jar SimpleInterestService-0.0.1-SNAPSHOT.jar
