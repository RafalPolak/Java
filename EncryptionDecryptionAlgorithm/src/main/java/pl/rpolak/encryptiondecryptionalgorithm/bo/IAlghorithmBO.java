package pl.rpolak.encryptiondecryptionalgorithm.bo;

/**
 * Created by Rafal Polak on 15.07.2017.
 */
public interface IAlghorithmBO {

    String encode(String text);
    String decode(String text);

}
