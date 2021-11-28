## Build Application
gradlew clean build

## Build & Run Application
gradlew clean build bootRun

## Docker Build
docker build --build-arg JAR_FILE=build/libs/*.jar -t timesheetapi-img:latest .

## Remove container
docker rm timesheetapi-container

## Docker run
docker run -d --name timesheetapi-container -p 8080:8080 timesheetapi-img:latest

## Restart container
docker stop timesheetapi-container

## Start Container
docker start timesheetapi-container

## Check logs in the api
docker exec -it timesheetapi-container bin/sh
tail -f logs/spring.log

## gradle docker build
gradlew docker

## gradle docker run
gradlew dockerRun

## gradle docker stop
gradlew dockerStop

## Full clean build docker build and run
gradlew clean build docker dockerStop dockerRun

