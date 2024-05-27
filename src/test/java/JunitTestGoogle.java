import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//anotaciones en Junit
//primero se crea el driver que sea accessible a todas las siguientes funciones
public class JunitTestGoogle {

    static ChromeDriver browser;
  

    //aqui va la parte de reporteria o cualquier funcion que se pueda reestablecer de ultimo
    @BeforeClass
    public static void beforeClass(){
        browser = new ChromeDriver();

    }

    @Before
    public void before(){
        browser.get("http://www.google.com/?h=es");
        browser.manage().window().maximize();

    }

    @Test
    @Ignore//ignora el caso
    public void test(){
        System.out.println("Test");
    }
    @Test
    public void test2() throws InterruptedException {
        WebElement search = browser.findElement(By.name("q"));
        search.sendKeys("Automatizador");
        search.submit();
        Thread.sleep( 3000);

    }

    @After
    public void after(){
        browser.close();
    }

    @AfterClass
    public static void afterClass(){//son las unicas que son static, beforeClass y afterClass
        System.out.println("AfterClass");
    }
    //Testng tiene la parte de reporteria cosa que Junit no lo tiene
}
