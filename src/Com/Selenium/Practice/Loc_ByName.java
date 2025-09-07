package Com.Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_ByName{
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
     Thread.sleep(1000);
        WebElement userName = driver.findElement(By.name("txtCustomerID"));
        userName.sendKeys("abxvcdjfm@gmail.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("xyZ@3qke125");
        Thread.sleep(1000);
        WebElement loginBtn = driver.findElement(By.name("Butsub"));
        loginBtn.click();
        WebElement textMessage = driver.findElement(By.xpath("//span[@class='error']"));
        Thread.sleep(4000);
        String TextMessage = textMessage.getText();
        System.out.println(TextMessage);
        driver.close();
    }
}