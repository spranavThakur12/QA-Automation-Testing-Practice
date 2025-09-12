package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("lodalehsan@gmail.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456Abcxyz");
        Thread.sleep(1000);
        WebElement loginBtn = driver.findElement(By.cssSelector("button[class^='btn']"));
        Thread.sleep(2000);
        driver.quit();
        loginBtn.click();
    }
}
