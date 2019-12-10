import woowa.sw.baseball.BaseballGame;
import woowa.sw.baseball.RandomBallGenerate;
import woowa.sw.baseball.UserImpl;

public class Main {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame(new UserImpl(), new RandomBallGenerate());
        baseballGame.playBaseballGame();
    }
}
