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

            public static void main(String[] args) {
                List<Map<String, String>> BOOKS = List.of(
                        Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611"),
                        Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111"),
                        Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611"),
                        Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222"),
                        Map.of("title", "Still foooing", "author", "FooBar", "year", "3333"),
                        Map.of("title", "Happy Foo", "author", "FooBar", "year", "4444")
                );

                Map<String, String> where = Map.of("title", "Still foooing",
                        "author", "FooBar",
                        "year", "3333"
                );
                List<Map<String, String>> actual = App.findWhere(BOOKS, where);
                System.out.println("результат\n" + actual + "\n размер - " + actual.size());
            }
        }