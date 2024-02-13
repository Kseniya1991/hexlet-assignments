package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

class App {
    public static String getForwardedVariables(String content) {
        return Arrays.stream(content.split("\n"))
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .map(line -> Arrays.stream(line.split(",")))
                .flatMap(line -> line.filter(subline -> subline.startsWith("X_FORWARDED_")))
                .map(line -> line.replaceAll("X_FORWARDED_", ""))
                .map(Object::toString)
                .collect(Collectors.joining(","));
    }

}