/*7.	Open https://www.google.com
	a.	Enter Selenium in search box using Xpath
	b.	Hit Enter
	c.	Verify the title (Title should contain sachin)	*/
package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocatorPractice{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/webhp");
        WebElement serachBox = driver.findElement(RelativeLocator.with(By.tagName("textarea")).above(By.name("btnK")));
         serachBox.sendKeys("Sachin");
        driver.close();
    }
}
