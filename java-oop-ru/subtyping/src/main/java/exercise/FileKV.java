package exercise;

import java.util.HashMap;
import java.util.Map;

public class FileKV implements KeyValueStorage {

    private final Map<String, String> data;
    private final String path;

    public FileKV(String filePath, Map<String, String> data) {
        Utils.writeFile(filePath, Utils.serialize(data));
        this.data = new HashMap<>(data);
        this.path = filePath;
    }


    @Override
    public void set(String key, String value) {
        data.put(key, value);
        Utils.writeFile(path, Utils.serialize(data));
    }

    @Override
    public void unset(String key) {
        data.remove(key);
        Utils.writeFile(path, Utils.serialize(data));
    }

    @Override
    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return Utils.unserialize(Utils.readFile(path));
    }
}
