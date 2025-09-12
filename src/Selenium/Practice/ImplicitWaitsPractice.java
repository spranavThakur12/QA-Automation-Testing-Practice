package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ImplicitWaitsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        //! opening the Selenium Tutorial url
        Thread.sleep(5000);
        System.out.println("current Window Title is:--> " + driver.getTitle());
        WebElement newTabURL = driver.findElement(By.xpath("//*[@id='HTML5']/div[1]/a"));
        newTabURL.click();


        //*switching to SecWindow
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        String mainWin = it.next();
        String secWin = it.next();
        //? clicking on the youtube button on SecWindow
        driver.switchTo().window(secWin);
        Thread.sleep(5000);
        System.out.println("Current Window Title is:--> " + driver.getTitle());
        WebElement youtubeBtn = driver.findElement(By.xpath("//*[@id='HTML4']/div[1]/table/tbody/tr/td[2]/a/img"));
        youtubeBtn.click();
//        System.out.println("Current Window Title is:--> " + driver.getTitle());

        Set<String> newWindows = driver.getWindowHandles();
         newWindows.removeAll(allWindows);
         Iterator<String> window = newWindows.iterator();
         String third = window.next();

         driver.switchTo().window(third);
        Thread.sleep(5000);
         System.out.println("title of the current Window is:--> " + driver.getTitle());

        Thread.sleep(5000);
        driver.quit();
    }
}
