package pl.rpolak.generator.bo;

import java.util.HashMap;
import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.name.Name;

/**
 *
 * @author Rafal.Polak
 */
public interface IGeneratorBO {
    
    Credentials generateCredential(int lenght);
    Name generateName(int gender);
    HashMap<Integer, Credentials> generateCredentials(int quantity, int lenght);
    HashMap<Integer, Name> generateNames(int quantity, int gender);
}
