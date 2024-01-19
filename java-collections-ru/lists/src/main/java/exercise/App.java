package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
        public static boolean scrabble(String chars, String word) {
            char[] arrayOfChars = chars.toLowerCase().toCharArray();
            char[] charsOfWord = word.toLowerCase().toCharArray();
            List<Character> listOfChars = new ArrayList<>();
            List<Character> listOfWordChars = new ArrayList<>();

            for (char symbol : arrayOfChars) {
                listOfChars.add(symbol);
            }
            for (char symbol : charsOfWord) {
                listOfWordChars.add(symbol);
            }

            boolean isContains = false;
            for (char ch : listOfWordChars) {
                if(listOfChars.contains(ch)) {
                    listOfChars.remove(listOfChars.indexOf(ch));
                    isContains = true;
                } else {
                    isContains = false;
                    break;
                }
            }
            return isContains;
        }
    }
