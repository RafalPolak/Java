package pl.rpolak.generator.bo;

import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.name.Name;

/**
 *
 * @author Rafal.Polak
 */
public interface IGeneratorBO {

    Name generateName(int gender);

    Credentials generateCredential(int lenght);
}
