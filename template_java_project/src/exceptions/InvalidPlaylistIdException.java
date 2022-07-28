package exceptions;

public class InvalidPlaylistIdException extends RuntimeException{
    private static final long serialVersionUID = 2780739005057153835L;

    public InvalidPlaylistIdException() {
        super();
    }

    public InvalidPlaylistIdException(String message) { super(message); }

    public InvalidPlaylistIdException(Throwable cause) { super(cause); }

    public InvalidPlaylistIdException(String message, Throwable cause) { super(message, cause); }
}
