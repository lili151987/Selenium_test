import org.junit.*;

public class JunitTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void before(){
        System.out.println("Before");
    }

    @Test
    @Ignore//ignora el caso
    public void test(){
        System.out.println("Test");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass(){//son las unicas que son static, beforeClass y afterClass
        System.out.println("AfterClass");
    }
}
