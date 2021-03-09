FROM openjdk:8
COPY ./target/calculator-spe-mini-project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-spe-mini-project-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator.Calculator"]
