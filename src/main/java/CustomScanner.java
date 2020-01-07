import java.util.Scanner;

public class CustomScanner {

    // TODO : System.in 방식이 아닌 방법을 택하려면 어떤 클래스를 써야함?
    private static Scanner scanner = new Scanner(System.in);

    public String getResponse(String request) {
        System.out.println(request);
        String response = scanner.nextLine();
        return response;
    }
}
