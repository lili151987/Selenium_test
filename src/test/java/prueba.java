import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class prueba {

    @Test
    public void testWaits() throws InterruptedException {

            ChromeDriver browser = new ChromeDriver();

            browser.get("https://www.saucedemo.com/");

            //browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(15));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
            WebElement userName = browser.findElement(By.name("user-name"));
            WebElement password = browser.findElement(By.name("password"));
            WebElement login = browser.findElement(By.id("login-button"));

            userName.sendKeys("standard_user");
            password.sendKeys("secret_sauce");
            login.click();




        }

        @Test
        public void TestLoginFail(){
            ChromeDriver browser = new ChromeDriver();

            browser.get("https://www.saucedemo.com/");


            WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(15));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));

            WebElement userName = browser.findElement(By.name("user-name"));
            WebElement password = browser.findElement(By.name("password"));
            WebElement login = browser.findElement(By.id("login-button"));

            userName.sendKeys("standard_user11");
            password.sendKeys("secret_sauce");

            login.click();

            WebElement errorMessage = browser.findElement(By.xpath("//h3[@data-test='error']"));

            Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",errorMessage.getText());

            login.click();
        }
    }

