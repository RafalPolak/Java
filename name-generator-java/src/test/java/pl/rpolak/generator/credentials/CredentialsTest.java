/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.rpolak.generator.credentials;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafal.Polak
 */
public class CredentialsTest {

    public CredentialsTest() {
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
    public void testEquals() {
        //given
        Credentials credentials1 = null;
        Credentials credentials2 = null;

        //when
        credentials1 = new Credentials("T123!");
        credentials2 = new Credentials("T123!");

        //then
        assertTrue(credentials1.equals(credentials2) && credentials2.equals(credentials1));
        assertTrue(credentials1.hashCode() == credentials2.hashCode());
    }

}
