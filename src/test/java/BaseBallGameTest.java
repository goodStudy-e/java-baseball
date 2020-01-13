import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseBallGameTest {

    final BaseBallGame baseBallGame = new BaseBallGame(10, "789");

    @Test
    public void isSameLengthTest() {
        boolean result = baseBallGame.isSameLength("123", "456");
        boolean result2 = baseBallGame.isSameLength("1234", "456");

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, result),
                () -> Assertions.assertEquals(false, result2)
        );
    }

    @Test
    public void isNumberTest() {
        boolean result = baseBallGame.isNumber("123");
        boolean result2 = baseBallGame.isNumber("123a");

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, result),
                () -> Assertions.assertEquals(false, result2)
        );
    }

    @Test
    public void confirmTest() {
        boolean result = baseBallGame.confirm("123");
        boolean result2 = baseBallGame.confirm("789");

        Assertions.assertAll(
                () -> Assertions.assertEquals(false, result),
                () -> Assertions.assertEquals(true, result2)
        );
    }

    @Test
    public void getIndexTest() {
        int index = baseBallGame.getIndex("8");
        int index2 = baseBallGame.getIndex("7");

        Assertions.assertAll(
                () -> Assertions.assertEquals(1, index),
                () -> Assertions.assertEquals(0, index2)
        );

    }
}
