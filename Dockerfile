FROM my-base-image
MAINTAINER Jonnathan Charpentier <jonnch15j@outlook.com>

EXPOSE 8080

RUN git clone https://github.com/JonnCh/SpringTest.git
WORKDIR /SpringTest
RUN mvn clean install package
CMD java -jar target/DemoApplication-spring-boot.jar
