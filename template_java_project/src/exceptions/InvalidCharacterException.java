package exceptions;

public class InvalidCharacterException extends RuntimeException{

    private static final long serialVersionUID = 2877611175116134226L;

    public InvalidCharacterException() {
        super();
    }

    public InvalidCharacterException(String message) { super(message); }

    public InvalidCharacterException(Throwable cause) { super(cause); }

    public InvalidCharacterException(String message, Throwable cause) { super(message, cause); }
}
