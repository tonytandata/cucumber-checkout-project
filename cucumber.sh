javac -cp "jars/*" step_definitions/CheckoutSteps.java
java -cp "jars/*:." io.cucumber.core.cli.Main -p pretty --snippets camelcase -g step_definitions features
