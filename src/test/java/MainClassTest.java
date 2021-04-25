import org.junit.*;

public class MainClassTest {

    @BeforeClass
    public static void beforeClassMethod(){

    }

    @Before
    public void setUp(){

    }

    @Test
    public void method1(){
        Assert.assertTrue(true);
        Assert.assertFalse(false);

    }

    @Test
    //@Ignore
    public void method2(){
        Assert.assertNull(null);
        Assert.assertNotNull(new Object());
        Assert.assertEquals(10, 5-5);
        Assert.assertNotEquals(2, 2-3);
    }

    @After
    public void tearDown(){

    }

    @AfterClass
    public static void afterClassMethod(){

    }
}
