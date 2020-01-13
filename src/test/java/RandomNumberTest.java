import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberTest {

    final RandomNumber randomNumber = new RandomNumber(3);

    @Test
    public void collectionToStringTest() {
        List<String> test = new ArrayList<>();
        test.add("3");
        test.add("4");
        test.add("5");
        String result = randomNumber.collectionToString(test);

        Set<String> test2 = new LinkedHashSet<>();
        test2.add("4");
        test2.add("4");
        test2.add("5");
        test2.add("6");
        String result2 = randomNumber.collectionToString(test2);

        Assertions.assertAll(
                () -> Assertions.assertEquals("345", result),
                () -> Assertions.assertEquals("456", result2)
        );
    }
}
