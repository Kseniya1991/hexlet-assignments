package exercise;

import java.util.List;
import java.util.stream.Collectors;

class App {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com"
    );

    public static Long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> FREE_DOMAINS.contains(splitByChar(email, "@")))
                .count();
    }

    public static String splitByChar(String string, String symbol) {
        return string.substring(string.indexOf(symbol) + 1);
    }
}
