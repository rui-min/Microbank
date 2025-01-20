# MicroBank "Cards", with Google Jib method
## Google Jib repo: https://github.com/GoogleContainerTools/jib
## Jib as Maven plugin: https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin

## Docker Containerization process
1. Ensure pom.xml has the correct packaging info \<packaging>jar\</packaging> 
2. Ensure pom.xml has below:
    <build>
        <plugins>
            ...
            <plugin>
                <groupId>com.google.cloud.tools</groupId>
                <artifactId>jib-maven-plugin</artifactId>
                <version>3.3.2</version>
                <configuration>
                    <from>
                        <image>eclipse-temurin:21-jre</image>
                    </from>
                    <to>
                        <image>zeromr2010/${project.artifactId}:s4</image>
                    </to>
                </configuration>
            </plugin>
        ...
3. Run command "mvn compile jib:dockerBuild"
4. Run container by "docker run -d -p <External port>:<Container port> <complete Docker image name, including tag>"
   (9000:any)

## Advantages of Google Jib method 
1. no professional knowledge required, no Dockerfile file needed
2. ensure better consistency, security, performance, and governance

## Disadvantages of Google Jib method
1. Only Java
2. New version has image building issue, use 3.3.2