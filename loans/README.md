# MicroBank "Loans", with Paketo Buildpack method

## Docker Containerization process
1. Ensure pom.xml has the correct packaging info \<packaging>jar\</packaging> 
2. Ensure pom.xml has below:
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <image>
                        <name>
                            zeromr2010/${project.artifactId}:s4
                        </name>
                    </image>
                </configuration>
            </plugin>
        ...
3. Run command "mvn spring-boot:build-image"
4. Run container by "docker run -d -p <External port>:<Container port> <complete Docker image name, including tag>"

## Advantages of Buildpoacks method 
1. no professional knowledge required, no Dockerfile file needed
2. ensure better consistency, security, performance, and governance