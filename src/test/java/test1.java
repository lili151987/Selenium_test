import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    @Test
    public void test1() throws InterruptedException {

        ChromeDriver browser = new ChromeDriver();

        browser.get("https://www.saucedemo.com/");

        Thread.sleep(3000);//esto no se debe usar en la practica

        WebElement userName = browser.findElement(By.name("user-name"));
        WebElement password = browser.findElement(By.name("password"));
        WebElement login = browser.findElement(By.id("login-button"));

        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();



    }

}