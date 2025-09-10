package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameLocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.className("js-login-field"));
        userName.sendKeys("abc.12@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.className("js-password-field"));
        password.sendKeys("#pqwe123e3");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.className("js-sign-in-button"));
        login.click();
        Thread.sleep(3000);
        driver.close();

    }
}
