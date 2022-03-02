# SimpleInterestService


If you only want to run this thing with no docker, please execute the following command:

mvn clean spring-boot:run

or

mvn clean install

and then 

java -jar target/SimpleInterestService-0.0.1-SNAPSHOT.jar

Execute those commands in root folder (no parent).

For docker build and execution, please follow the next commands:

docker compose build

and then

docker compose run -p 8080:8080 simpleinterestservice

execute em on 'docker' folder.

Hope you enjoy it as same as me developing this. :D
