package Exceptions;

public class NonDefinedOperationException extends Exception {

    public NonDefinedOperationException() {
    }

    public NonDefinedOperationException(String message) {
        super(message);
    }

    public NonDefinedOperationException(String message, Throwable exception) {
        super(message, exception);
    }

    public NonDefinedOperationException(Throwable exception) {
        super(exception);
    }
}
