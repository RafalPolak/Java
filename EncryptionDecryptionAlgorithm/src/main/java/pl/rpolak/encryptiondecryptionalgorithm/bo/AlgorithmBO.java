package pl.rpolak.encryptiondecryptionalgorithm.bo;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by Rafal Polak on 15.07.2017.
 */
public class AlgorithmBO implements IAlghorithmBO {

    @Override
    public String encode(String text) {
        byte message[] = text.getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(message);

        return encoded;
    }

    @Override
    public String decode(String text) {
        byte message[] = Base64.getDecoder().decode(text);
        String decoded = new String(message, StandardCharsets.UTF_8);

        return decoded;
    }
}
