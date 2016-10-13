/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rpolak.generator.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.rpolak.generator.credentials.Credentials;
import pl.rpolak.generator.name.Name;
import pl.rpolak.generator.util.LoadData;

/**
 *
 * @author Rafal.Polak
 */
public class LoadDataTest {

    public LoadDataTest() {
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
    public void shouldGeneratePassword() {
        //given
        Credentials credentials = null;
        LoadData loadData = new LoadData();
        int testPassword = 8;

        //when
        credentials = loadData.drawPassword(testPassword);

        //then
        assertNotNull(credentials);
        assertEquals(testPassword, credentials.getPassword().length() - 1);
    }

    @Test
    public void shouldGenerateNameSurnameMale() {
        //given
        Name name = null;
        LoadData loadData = new LoadData();
        int male = 1;

        //when
        name = loadData.loadAndDrawNameSurname(male);

        //then
        assertNotNull(name);
    }
    
    @Test
    public void shouldGenerateNameSurnameFemale(){
        //given
        Name name = null;
        LoadData loadData = new LoadData();
        int female = 2;
        
        //when
        name = loadData.loadAndDrawNameSurname(female);
        
        //then
        assertNotNull(name);
    }

}
