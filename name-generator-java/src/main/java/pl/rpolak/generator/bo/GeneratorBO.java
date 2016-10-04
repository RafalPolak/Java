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
    public Credentials generateCredential() {
        return new Credentials("TEST");
    }

    @Override
    public Name generateName() {
        LoadData load = new LoadData();
        
        load.loadAndChooseName();
        
        return new Name("TEST", "TEST");
    }

    @Override
    public HashMap<Integer, Credentials> generateCredentials(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, Name> generateNames(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
