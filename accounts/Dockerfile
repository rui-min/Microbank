# Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

# Add Maintainer Information
# MAINTAINER Ray
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="Ray"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java","-jar","/accounts-0.0.1-SNAPSHOT.jar"]

# Build the image
# docker build . -t <Docker username>/<app name>:<tag name>

# Run in Detached mode
# PORT Mapping: 1 Container port can be used for multiple external ports simultaneously
# docker run -d -p <External port>:<Container port> <complete Docker image name, including tag>

# Check all docker images
# docker images

# Check running containers
# docker ps

# start a running container(stop just change the keyword)
# docker start <container id>