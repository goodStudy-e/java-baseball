

// TODO : Exception handler 만들어야함
public class OverDigitException extends RuntimeException{

    private String message;

    public OverDigitException() {
        String message = "10자리수 미만으로만 가능합니다.";
        this.message = message;
    }

    public OverDigitException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
