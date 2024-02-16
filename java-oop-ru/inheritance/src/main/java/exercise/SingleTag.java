package exercise;

import java.util.Map;

// BEGIN
    public class SingleTag extends Tag {

    SingleTag(String line, Map<String, String> attributes) {
        setMainTag(line);
        setMapTag(attributes);
        returnText = String.format("<%s%s>", mainTag, mapTag);
    }
}
