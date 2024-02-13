package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

    public class App {
        public static LinkedHashMap<String, String> genDiff(Map<String, Object> fisrtDictionary, Map<String, Object> secondDictionary) {
            LinkedHashMap<String, String> result = new LinkedHashMap<>();
            Set<String> set = new TreeSet<>(fisrtDictionary.keySet());
            set.addAll(secondDictionary.keySet());
            System.out.println(set);
            for (String key : set) {
                if (fisrtDictionary.containsKey(key)) {
                    result.put(key, "deleted");
                }
                if (secondDictionary.containsKey(key)) {
                    result.put(key, "added");
                }
                if ((fisrtDictionary.containsKey(key) && secondDictionary.containsKey(key)) && (fisrtDictionary.get(key).equals(secondDictionary.get(key)))) {
                    result.put(key, "unchanged");
                } else {
                    if ((fisrtDictionary.containsKey(key) && secondDictionary.containsKey(key)) && !(fisrtDictionary.get(key).equals(secondDictionary.get(key)))) {
                        result.put(key, "changed");
                    }
                }
            }
            /*Map<String, Object> result = new LinkedHashMap<>(fisrtDictionary);
            result.putAll(secondDictionary);
            Set<String> firstSet = new TreeSet<>(fisrtDictionary.keySet());
            Set<String> secondSet = new TreeSet<>(secondDictionary.keySet());
            Set<String> crossing = new TreeSet<>(firstSet);
            crossing.retainAll(secondSet);
            Set<String> removeDifference = new TreeSet<>(firstSet);
            removeDifference.removeAll(secondSet);
            Set<String> addDifference = new TreeSet<>(secondSet);
            addDifference.removeAll(secondSet);

            for (Map.Entry<String, Object> entry : result.entrySet()) {
                if (removeDifference.contains(entry.getKey())) {
                    entry.setValue("deleted");
                }
                if (addDifference.contains(entry.getKey())) {
                    entry.setValue("added");
                }
                if (crossing.contains(entry.getKey())) {
                    for (Map.Entry<String, Object> entry1 : fisrtDictionary.entrySet()) {
                        for (Map.Entry<String, Object> entry2 : secondDictionary.entrySet()) {
                            if (entry.getKey().equals((entry1.getKey())) && entry.getKey().equals((entry2.getKey())) {
                                if (entry1.equals(entry2)) {
                                    entry.setValue("unchanged");
                                } else {
                                    entry.setValue("changed");
                                }
                            }
                        }
                    }
                }
            }*/
            return result;
        }
}
