package pl.rpolak.temperatureconverter.exception;

/**
 *
 * @author Rafal.Polak
 */
public class IncorrectValueException extends RuntimeException {

    public IncorrectValueException() {
        super();
    }

    public IncorrectValueException(String message) {
        super(message);
    }

}
