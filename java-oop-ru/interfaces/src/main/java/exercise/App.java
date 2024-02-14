package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    public class App {
        public static List<String> buildApartmentsList(List<Home> houses, int count) {
            return houses.stream()
                    .sorted(Home::compareTo)
                    .limit(count)
                    .map(Home::toString)
                    .collect(Collectors.toList());
        }
}