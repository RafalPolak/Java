package pl.rpolak.generator.exception;

/**
 *
 * @author Rafal.Polak
 */
public class PasswordLenghtException extends RuntimeException {

    public PasswordLenghtException() {
        super();
    }

    public PasswordLenghtException(String message) {
        super(message);
    }
}
