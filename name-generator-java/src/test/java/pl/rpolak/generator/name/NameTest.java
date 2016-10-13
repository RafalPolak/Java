package pl.rpolak.generator.name;

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
public class NameTest {

    public NameTest() {
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
        Name name1 = null;
        Name name2 = null;

        //when
        name1 = new Name("Adam", "Nowak");
        name2 = new Name("Adam", "Nowak");

        //then
        assertTrue(name1.equals(name2) && name2.equals(name1));
        assertTrue(name1.hashCode() == name2.hashCode());
    }
    
    @Test
    public void shouldReturnSettedNameSurname(){
        //given
        String name = "Jan";
        Name data = new Name("TEST", "TEST");
        
        //when
        data.setName(name);
        
        //then
        assertNotNull(data);
        assertEquals(data.getName(), name);
    }

    @Test
    public void shouldReturnSettedSurname(){
        //given
        String surname = "Kowalski";
        Name data = new Name("TEST", "TEST");
        
        //when
        data.setSurname(surname);
        
        //then
        assertNotNull(data);
        assertEquals(data.getSurname(), surname);        
    }
}
