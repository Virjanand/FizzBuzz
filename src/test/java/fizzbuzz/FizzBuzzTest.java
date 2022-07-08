package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void printListOfNumbers() {
        List<String> listOfNumbers = new FizzBuzz().getNumbers();
        assertThat(listOfNumbers).contains("1", "2", "3", "100");
    }
}
