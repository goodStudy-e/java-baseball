public class Main {
    public static void main(String[] args) {
        try {
            RandomNumber randomNumber = new RandomNumber(Integer.parseInt(new CustomScanner().getResponse("몇 자리 게임 할거야?")));
            BaseBallGame baseBallGame = new BaseBallGame(10, randomNumber.getBaseBallNumber());
            baseBallGame.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
