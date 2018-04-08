import org.junit.*;
import pl.rpolak.encryptiondecryptionalgorithm.bo.AlgorithmBO;

/**
 * Created by Rafal Polak on 17.07.2017.
 */
public class AlgorithmBOTest {

    public AlgorithmBOTest(){};

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
    public void shouldEncodeText(){

        //given
        AlgorithmBO algorithmBO = new AlgorithmBO();
        String text = "HelloWorld";
        String encodedText = "SGVsbG9Xb3JsZA==";
        String encoded = null;

        //when
        encoded = algorithmBO.encode(text);

        //then
        Assert.assertNotNull(encoded);
        Assert.assertEquals(encodedText,encoded);

    }

    @Test
    public void shouldDecodeText(){

        //given
        AlgorithmBO algorithmBO = new AlgorithmBO();
        String decodedText = "HelloWorld";
        String encodedText = "SGVsbG9Xb3JsZA==";
        String decoded = null;

        //when
        decoded = algorithmBO.decode(encodedText);

        //then
        Assert.assertNotNull(decoded);
        Assert.assertEquals(decodedText,decoded);

    }


}
