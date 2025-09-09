package AssignmentAndNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AssignmentNo_11 extends LaunchBrowsers {
    public static void main(String[] args) {
        launchBrowser("chrome");
        launchURL("https://www.redbus.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //! Source Place
        WebElement from = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[1]"));
        from.click();
        WebElement inputFrom = driver.findElement(By.cssSelector("input[class^='inputField'][id^='srcDest']"));
        inputFrom.sendKeys("All");
        WebElement startForm = driver.findElement(By.cssSelector("div[role='heading'][aria-label^='Allahabad']"));
        startForm.click();
//        System.out.print("Journey Start From:--> " +startForm.getText());
        //! Destination Place
        WebElement to = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[2]"));
        to.click();
         WebElement inputTo = driver.findElement(By.xpath("//*[@id='srcDest']"));
         inputTo.sendKeys("Pune");
          WebElement destnination = driver.findElement(By.cssSelector("div[role='heading'][aria-label^='Viman Nagar']"));
          destnination.click();
          //?date selecting
          WebElement date = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]"));
          date.click();
          WebElement chooseDate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[18]/div/div"));
          chooseDate.click();
          WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/button"));
          search.click();
          WebElement name = driver.findElement(By.xpath("//*[@id='35778962']"));
         System.out.println(name.getText());
        driver.close();
    }
}
