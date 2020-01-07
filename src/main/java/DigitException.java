

// TODO : Exception handler 만들어야함
public class DigitException extends Exception {

    public DigitException() {
        super("10자리수 미만으로만 가능합니다.");
    }

    public DigitException(String msg) {
        super(msg);
    }


}
