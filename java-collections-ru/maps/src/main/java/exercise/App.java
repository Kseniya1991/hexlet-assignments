package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class App {
            public static Map<String, Integer> getWordCount(String line) {
                if (line == null || line.equals("")) {
                    return new HashMap<>();
                }
                String[] arrayOfWords = line.split(" ");
                List<String> listOfWords = Arrays.asList(arrayOfWords);
                Map<String, Integer> words = new HashMap<>();

                for (String word : listOfWords) {
                    if (words.containsKey(word)) {
                        int index = words.get(word) + 1;
                        words.put(word, index);
                    } else {
                        words.put(word, 1);
                    }
                }
                return words;
            }

            public static String toString(Map<String, Integer> map) {
                if(map.isEmpty()) {
                    return "{}";
                } else {
                    String result = "";
                    for (Map.Entry<String, Integer> word : map.entrySet()) {
                        result += "  " + word.getKey() + ": " + word.getValue() + "\n";
                    }
                    return "{\n" + result + "}";
                }
            }

            public static void main(String[] args) {
                String sentence3 = "";
                Map wordCount3 = App.getWordCount(sentence3);
                System.out.println(wordCount3);
                String actual3 = App.toString(wordCount3);
                System.out.println(actual3);;
            }
        }
