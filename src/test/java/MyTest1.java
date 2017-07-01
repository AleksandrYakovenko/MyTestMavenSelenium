import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyTest1 {
  @Test
    public void navigatetoPayoneerSiteandSingUp() {


      WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://payouts.payoneer.com/partners/or.aspx?pid=YOYIZC74IO2s4KZQp7tgsw%3d%3d");


    WebElement searchField = driver.findElement(By.cssSelector("#txtFirstName"));
    searchField.sendKeys("Aleksandr");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

      searchField = driver.findElement(By.cssSelector("#txtLastName"));
      searchField.sendKeys("Yakovenko");
      driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

         searchField = driver.findElement(By.cssSelector("#txtEmail"));
         searchField.sendKeys("alex1974jak@gmail.com");
         driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

           searchField = driver.findElement(By.cssSelector("#txtRetypeEmail"));
           searchField.sendKeys("alex1974jak@gmail.com");
           driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

             searchField = driver.findElement(By.cssSelector("#datepicker5"));
             searchField.sendKeys("06/24/1974");
             driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

               WebElement searchButton = driver.findElement(By.cssSelector("#PersonalDetailsButton"));
               searchButton.click();






  }
}



