# MicroBank microservices - accounts, cards, loans

## 3 Docker containerization methods
1. Dockerfile - accounts service
2. Buildpacks by Paketo - loans service
3. Google Jib(for java) - cards service

## push local docker images to Docker Hub
"docker image push docker.io/<username>>/<app name>:<tag>"

## pull Docker hub images to local
"docker pull <username>>/<app name>:<tag>"

## Docker Compose - enable simple command to create,start,stop and manage multiple microservices containers
* check docker compose version - "docker compose version"
* create "docker-compose.yml" YAML file(s) in repo root/service root
* run "docker compose up -d" to execute compose yaml file & run containers (detached mode)
* run "docker compose start" to start existing containers
* run "docker compose stop" to stop running containers
* run "docker compose down" to stop and REMOVE containers

## Docker client extension recommendations
* Logs Explorer