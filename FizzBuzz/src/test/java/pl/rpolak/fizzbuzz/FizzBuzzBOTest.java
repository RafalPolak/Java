package pl.rpolak.fizzbuzz;

import org.junit.*;
import pl.rpolak.fizzbuzz.bo.FizzBuzzBO;
import pl.rpolak.fizzbuzz.util.WordCounter;

/**
 * Created by Rafal Polak on 08.04.2018.
 */

public class FizzBuzzBOTest {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public FizzBuzzBOTest() {

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
    public void shouldReturnCorrectFizzBuzzWord() {
        //given
        int numberToCheck = 10;
        int fizzCount = 3;
        int buzzCount = 2;
        int fizzCountResults = 0;
        int buzzCountResults = 0;
        String results = null;

        FizzBuzzBO fizzBuzzBO = new FizzBuzzBO();

        //when
        results = fizzBuzzBO.recognizeWords(numberToCheck);

        //then
        fizzCountResults = WordCounter.checkOccurs(FIZZ, results);
        buzzCountResults = WordCounter.checkOccurs(BUZZ, results);

        Assert.assertEquals(fizzCountResults, fizzCount);
        Assert.assertEquals(buzzCountResults, buzzCount);
    }

}
