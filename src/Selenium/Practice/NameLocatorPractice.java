package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login");
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.name("email"));
        userName.sendKeys("abc.12@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("#pqwe123e3");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        Thread.sleep(2000);
        driver.close();

    }
}
