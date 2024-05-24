import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
    @Test
    public void test2(int deltaX){
        ChromeDriver browser = new ChromeDriver();

        browser.get("https://www.google.com/?hl=es");

        WebElement search = browser.findElement(By.name("q"));

        Actions actions = new Actions(browser);

        actions.click(search).sendKeys("Selenium").perform();

        actions.sendKeys(Keys.ENTER).perform();

        actions.scrollByAmount(0, 2000).perform();



    }


}