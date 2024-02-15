package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

    public class App {
        public static void swapKeyValue(KeyValueStorage data) {

            Map<String, String> clonedInitial = data.toMap();

            for (Map.Entry<String, String> entry : clonedInitial.entrySet()) {
                data.unset(entry.getKey());
                data.set(entry.getValue(), entry.getKey());
            }
        }
    }