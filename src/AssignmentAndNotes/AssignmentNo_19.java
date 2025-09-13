package AssignmentAndNotes;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class AssignmentNo_19 extends LaunchBrowsers {
    public static void main(String[] args) throws InterruptedException {
        launchBrowser("Chrome");
        driver.manage().window().maximize();
        launchURL("https://demoqa.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        //?Printing the MAin window title

        System.out.println("The title Of Main Window is:--> " + driver.getTitle());
        js.executeScript(("arguments[0].click();"), wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div"))));

        //?Clicking on Browser Window
        Sleep();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/div/ul/li")).click();

        //?Clicking on new Tab Button
        driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        String mainWind = it.next();
        String secWin = it.next();

        driver.switchTo().window(secWin);
        System.out.println("The second window Url is:--> "+driver.getCurrentUrl());
        WebElement secwinText = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
        System.out.println("The Sec Window Text is:--> " + secwinText.getText());
        Sleep();
//        driver.close();
        //? Switching Main window Again
        driver.switchTo().window(mainWind);
        //* Clicking on Sec Window Button
        js.executeScript(("arguments[0].click();"), wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"windowButton\"]"))));

        Set<String> newWind = driver.getWindowHandles();
        newWind.removeAll(allWindows);
        Iterator<String> it2 = newWind.iterator();
        String third = it2.next();

        driver.switchTo().window(third);
        System.out.println("The Url of third window is:--> "+driver.getCurrentUrl());
        System.out.println("========================================");

       driver.switchTo().window(mainWind);
       System.out.println("The Current Window Url is:--> "+ driver.getCurrentUrl());

       WebElement webEleBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"messageWindowButton\"]")));
        js.executeScript(("arguments[0].click();"),webEleBtn);


       Set<String> newWin = driver.getWindowHandles();
       newWin.removeAll(allWindows);
       newWin.removeAll(newWind);
       Iterator<String> it3 = newWin.iterator();
       String fourthWin = it3.next();

       driver.switchTo().window(fourthWin);
        System.out.println(newWin);
        System.out.println("The title of current window is:--> "+driver.getCurrentUrl());
        driver.findElement(By.xpath("/html/body")).getText();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body"))).getText();

        driver.quit();
    }
}
//        newWind.removeAll(allWindows);
//        Iterator<String> it2 = newWind.iterator();
//        String third = it2.next();

//        driver.switchTo().window(third);
//        Thread.sleep(5000);
//        System.out.println(mainWind);
//        System.out.println(secWin);
//        System.out.println(third);

//       Thread.sleep(1000);
//        System.out.println(mainWind);
//        System.out.println(secWin);
//        System.out.println(third);


















