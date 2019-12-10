package woowa.sw.baseball;

public interface User {
    String[] getUserRandomBall() throws IllegalArgumentException;

    void printResult(String result);

    void printEndMsg();

    String checkEndOrContinue() throws IllegalArgumentException;
}
