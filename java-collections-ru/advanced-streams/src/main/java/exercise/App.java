package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

    public class App {
        public static String getForwardedVariables(String conf) {
            String[] words = conf.split(","); //строку в массив
            var result1 =  Arrays.stream(words)
                    .filter(word -> word.startsWith("X_FORWARDED_"))
                    .map(word -> word.replace("X_FORWARDED_",  "").trim())
                    .collect(Collectors.toList());
            String string = "";
            for (String str : result1) {
                if(string.equals("")) {
                    string += str;
                } else {
                    string += "," + str;
                }
            }
            return string;
        }

        public static void main(String[] args) {
            String result1 = "X_FORWARDED_mail=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en";
            String expected1 = App.getForwardedVariables(result1);  //"variable=value";
            System.out.println(expected1);
        }
}