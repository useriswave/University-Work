package questions.q1.exceptions;

public class BoxFullException extends RuntimeException{
    public BoxFullException () {
        super("Cannot add more items to a full box");
    }

    public BoxFullException (String message, Throwable cause) {
        super(message, cause);
    }
}
