package exercise;

import java.util.stream.Collectors;
import java.util.Map;

    abstract class Tag {
        String mainTag;
        String mapTag;
        String listTag;
        String returnText;

        public void setMainTag(String mainTag) {
            this.mainTag = mainTag;
        }

        public void setMapTag(Map<String, String> map) {
            mapTag ="";
            map.forEach((key, value) -> {
                mapTag = mapTag + String.format(" %s=\"%s\"", key, value);
            });
        }
        @Override
        public String toString() {
            return returnText;
        }
}
