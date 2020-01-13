public class Main {
    private static final int CHANCE = 10;

    public static void main(String[] args) {
        while (true) {
            try {
                RandomNumber randomNumber = new RandomNumber(Integer.parseInt(new CustomScanner().getResponse("몇 자리 게임 할거야?")));
                BaseBallGame baseBallGame = new BaseBallGame(CHANCE, randomNumber.getBaseBallNumber());
                baseBallGame.run();
                break;
            } catch (OverDigitException e) {
                System.out.println(e.getMessage());
                continue;
            } catch (NumberFormatException e){
                System.out.println("잘못 입력하였습니다. 다시 입력하여주세요.");
                continue;
            }
        }
    }
}
