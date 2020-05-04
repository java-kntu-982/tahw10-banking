package ir.ac.kntu;

// TODO: An Unchecked Exception. - Fix The Extension.
public class NoSuchAccountNumberException extends Throwable /*Change Throwable*/ {
    public NoSuchAccountNumberException() {
        super();
    }

    public NoSuchAccountNumberException(String message) {
        super(message);
    }

    public NoSuchAccountNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchAccountNumberException(Throwable cause) {
        super(cause);
    }
}
