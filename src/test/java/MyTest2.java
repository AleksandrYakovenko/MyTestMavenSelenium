import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyTest2 {
    @Test

    public void SingUpToTestIoMyTest() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://tester.test.io/testers/sign_up");

        WebElement searchField = driver.findElement(By.cssSelector("#tester_full_name"));
        searchField.sendKeys("Koto Moto");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            searchField = driver.findElement(By.cssSelector("#tester_email"));
            searchField.sendKeys("kotomotogen@gmail.com");
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

               searchField = driver.findElement(By.cssSelector("#tester_password"));
               searchField.sendKeys("Koto24Moto");
               driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

                  WebElement searchButton = driver.findElement(By.cssSelector(".btn.btn-default.btn.btn-lg.btn-primary.btn-block"));
                  searchButton.click();
















    }
}
