# MicroBank "Accounts", with Dockerfile method

## Docker Containerization process
1. Ensure pom.xml has the correct packaging info \<packaging>jar\</packaging> 
2. Run "mvn clean install" inside /accounts to generate fat jar under /target (>40MB)
3. Write Dockerfile in /accounts
4. Generate docker image by running "docker build . -t <Docker username>/<app name>:<tag name>"
5. Create and Run container by "docker run -d -p <External port>:<Container port> <complete Docker image name, including tag>"

## Disadvantages of Dockerfile method
1. Need Docker script knowledge
2. Best practices knowledge to limit size of image and containers
3. Security knowledge related to Docker
4. Too many Dockerfile across hundreds of microservices