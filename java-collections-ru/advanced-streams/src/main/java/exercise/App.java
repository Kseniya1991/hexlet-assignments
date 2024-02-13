package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

    public class App {
        public static String getForwardedVariables(String conf) {
            String[] words = conf.split(","); //строку в массив
            var result =  Arrays.stream(words)
                    .filter(word -> word.startsWith("X_FORWARDED_"))
                    .map(word -> word.replace("X_FORWARDED_",  "").trim())
                    .collect(Collectors.toList());
            return result.toString();
        }
}