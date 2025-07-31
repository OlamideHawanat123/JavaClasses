package chapter15.exception;

public class InvalidPathException extends RuntimeException {
    public InvalidPathException(String message) {
        super(message);
    }
}
