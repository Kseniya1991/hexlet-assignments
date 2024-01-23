package exercise;

import java.util.*;
import java.util.Map.Entry;

        public class App {
            public static List<Map<String, String>> findWhere(List<Map<String, String>> listOfBooks, Map<String, String> strings) {
                if (listOfBooks.isEmpty() || strings.isEmpty()) {
                    return new ArrayList<>();
                }
                List<Map<String, String>> coincidenceOfNames = new ArrayList<>();

                for (Map<String, String> book : listOfBooks) {
                    for (Map.Entry<String, String> book2 : strings.entrySet()) {
                        Map<String, String> mapBook = Map.of(book2.getKey(), book2.getValue());
                        if (book.get(book2.getKey()).equals(book2.getValue())) {
                                if (!coincidenceOfNames.contains(mapBook)) {
                                    coincidenceOfNames.add(Map.of(book2.getKey(),book2.getValue()));
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