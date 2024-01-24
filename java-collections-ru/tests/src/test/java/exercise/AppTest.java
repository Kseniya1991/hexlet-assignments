package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> numbers;

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        List<Integer> list = App.take(numbers1, 2);
        Assertions.assertThat(list.get(list.size() - 1)).isEqualTo(2);
        // END
    }
}
