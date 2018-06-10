FROM openjdk:8
RUN git clone https://github.com/JonnCh/SpringTest.git
WORKDIR /SpringTest/src
RUN javac main/java/com/example/demo/DemoApplication.java
CMD ["java", "DemoApplication"]