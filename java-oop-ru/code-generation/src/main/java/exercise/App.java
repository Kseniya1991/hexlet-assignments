package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

    class App {
        public static void save(Path path, Car car) throws Exception {
            Files.writeString(path, car.serialize(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        public static Car extract(Path path) throws Exception {
            return Car.unserialize(Files.readString(path));
        }
    }