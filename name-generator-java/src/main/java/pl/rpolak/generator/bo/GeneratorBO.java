package pl.rpolak.generator.bo;

import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.name.Name;
import pl.rpolak.generator.util.LoadData;

/**
 *
 * @author Rafal.Polak
 */
public class GeneratorBO implements IGeneratorBO {

    @Override
    public Credentials generateCredential(int lenght) {
        Credentials credentials = null;

        LoadData load = new LoadData();

        credentials = load.drawPassword(lenght);

        //todo exception if credentials is null
        return credentials;
    }

    @Override
    public Name generateName(int gender) {

        Name data = null;

        LoadData load = new LoadData();

        data = load.loadAndDrawNameSurname(gender);

        //todo exception if data is null
        return data;
    }

}
