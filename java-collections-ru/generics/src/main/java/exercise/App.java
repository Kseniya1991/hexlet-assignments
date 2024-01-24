package exercise;

import java.util.*;
import java.util.Map.Entry;

        public class App {
            public static List<Map<String, String>> findWhere(List<Map<String, String>> listOfBooks, Map<String, String> strings) {
                if (listOfBooks.isEmpty() || strings.isEmpty()) {
                    return new ArrayList<>();
                }
                List<Map<String, String>> coincidenceOfNames = new ArrayList<>(listOfBooks);

                for (var value : listOfBooks) { //мапа из списка
                    for (Map.Entry<String, String> map : value.entrySet()) { //ключи и значения из мапы из списка
                        for (Map.Entry<String, String> string : strings.entrySet()) { //ключи и значения из переданной в метод мапы
                            if (!value.containsValue(string.getValue())) {
                                if (coincidenceOfNames.contains(value)) {
                                    coincidenceOfNames.remove(value);
                                }
                            }
                        }
                    }
                }
                return coincidenceOfNames;
            }
        }