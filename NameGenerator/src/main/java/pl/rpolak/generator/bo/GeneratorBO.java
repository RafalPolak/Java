package pl.rpolak.generator.bo;

import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.exception.PasswordLenghtException;
import pl.rpolak.generator.name.Name;
import pl.rpolak.generator.util.LoadData;

/**
 *
 * @author Rafal.Polak
 */
public class GeneratorBO implements IGeneratorBO {

    private final int MIN_LENGHT = 6;
    private final int MAX_LENGHT = 15;
    
    @Override
    public Credentials generateCredential(int lenght) {
        Credentials credentials = null;

        if(lenght<=MIN_LENGHT){
            throw new PasswordLenghtException("Password is too short!!!");
        }
        
        if(lenght>MAX_LENGHT){
            throw new PasswordLenghtException("Password is too long!!!");
        }
        
        LoadData load = new LoadData();

        credentials = load.drawPassword(lenght);

        return credentials;
    }

    @Override
    public Name generateName(int gender) {

        Name data = null;

        LoadData load = new LoadData();

        data = load.loadAndDrawNameSurname(gender);

        return data;
    }

}
