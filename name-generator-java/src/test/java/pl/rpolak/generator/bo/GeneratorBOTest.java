/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rpolak.generator.bo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.exception.PasswordLenghtException;
import pl.rpolak.generator.name.Name;

/**
 *
 * @author Rafal.Polak
 */
public class GeneratorBOTest {

    public GeneratorBOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldReturnGeneratedNameMale() {
        //given
        GeneratorBO generatorBO = new GeneratorBO();
        int male = 1;
        Name name = null;

        //when
        name = generatorBO.generateName(male);

        //then
        //todo add method to check if proper part word end 
        assertNotNull(name);
    }

    @Test
    public void shouldReturnGeneratedNameFemale() {
        //given
        GeneratorBO generatorBO = new GeneratorBO();
        int female = 2;
        Name name = null;

        //when
        name = generatorBO.generateName(female);

        //then
        assertNotNull(name);
    }

    @Test
    public void shouldReturnProperGeneratedPassword() {
        //given
        GeneratorBO generatorBO = new GeneratorBO();
        int lenght = 8;
        Credentials credentials = null;

        //when
        credentials = generatorBO.generateCredential(lenght);

        //then
        assertNotNull(credentials);
        assertEquals(lenght, credentials.getPassword().length() - 1);
    }

    @Test(expected = PasswordLenghtException.class)
    public void shouldReturnPasswordLenghtExceptionWhenPasswordTooShort() {
        //given
        GeneratorBO generatorBO = new GeneratorBO();
        int lenght = 3;
        Credentials credentials = null;

        //when
        credentials = generatorBO.generateCredential(lenght);

        //then
    }

    @Test(expected = PasswordLenghtException.class)
    public void shouldReturnPasswordLenghtExceptionWhenPasswordTooLong() {
        //given
        GeneratorBO generatorBO = new GeneratorBO();
        int lenght = 25;
        Credentials credentials = null;

        //when
        credentials = generatorBO.generateCredential(lenght);

        //then
    }
}
