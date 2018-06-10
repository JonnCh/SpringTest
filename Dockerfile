FROM openjdk:8
git clone https://github.com/JonnCh/SpringTest.git
WORKDIR /usr/SpringTest/src
RUN javac main/java/com/example/DemoApplication.java
CMD ["java", "DemoApplication"]