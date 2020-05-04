package ir.ac.kntu;

// TODO: A Checked Exception. - FIX the extension
public class OperationFailedException extends Throwable /*Change Throwable*/ {
    public OperationFailedException() {
    }

    public OperationFailedException(String message) {
        super(message);
    }

    public OperationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationFailedException(Throwable cause) {
        super(cause);
    }
}
