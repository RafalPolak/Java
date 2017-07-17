package pl.rpolak.encryptiondecryptionalgorithm.exception;

/**
 * Created by Rafal Polak on 15.07.2017.
 */
public class IncorrectTextException extends RuntimeException {

    public IncorrectTextException() {
        super();
    }

    public IncorrectTextException(String message) {
        super(message);
    }

}
