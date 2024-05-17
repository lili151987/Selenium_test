import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba {

    @Test
    public void test1() {

        ChromeDriver browser = new ChromeDriver();

        browser.get("https://www.google.com");

        WebElement search = browser.findElement(By.name("q"));

        search.sendKeys("Que es Java");
        search.submit();



    }

}