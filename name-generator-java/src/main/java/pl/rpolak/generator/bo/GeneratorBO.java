package pl.rpolak.generator.bo;

import java.util.HashMap;
import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.name.Name;
import pl.rpolak.generator.util.LoadData;

/**
 *
 * @author Rafal.Polak
 */
public class GeneratorBO implements IGeneratorBO{

    @Override
    public Credentials generateCredential(int lenght) {
        return new Credentials("TEST");
    }

    @Override
    public Name generateName(int gender) {
        
        Name data = null;
        
        LoadData load = new LoadData();
        
        data = load.loadAndDrawNameSurname(gender);
        
        //todo exception if data is null
        
        return data;
    }

    @Override
    public HashMap<Integer, Credentials> generateCredentials(int quantity, int lenght) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, Name> generateNames(int quantity, int gender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
