package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class App {
            public static Map<String, Integer> getWordCount(String line) {
                String[] arrayOfWords = line.split(" ");
                List<String> listOfWords = Arrays.asList(arrayOfWords);
                Map<String, Integer> words = new HashMap<>();

                for (int i = 0; i < listOfWords.size(); i++) {
                    if(words.containsKey(listOfWords.get(i))) {
                        int index = words.get(listOfWords.get(i)) + 1;
                        words.put(listOfWords.get(i), index);
                    } else {
                        words.put(listOfWords.get(i), 1);
                    }
                }
                return words;
            }

            public static String toString(Map<String, Integer> map) {
                String result = "{\n";
                for (Map.Entry<String, Integer> word : map.entrySet()) {
                    result += "  " + word.getKey() + ": " + word.getValue() + "\n";
                }
                return result + "}";

            }
        }
