package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class HandilingMultipleCheckBoxAndRadio extends LaunchBrowsers{
    public static void main(String[] args) {
        launchBrowser("chrome");
        launchURL("https://omayo.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> radioBtn = driver.findElements(By.xpath("//input[@type='radio'][@name='vehicle']"));
       for(WebElement element: radioBtn){
           if(element.isEnabled()){
               if(element.isDisplayed()){
                   if(element.isSelected()){
                       Sleep();
                       element.click();
                   } else {
                       Sleep();
                       element.click();
                   }
               }
           }
       }
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox'][@name='accessories']"));
        for (WebElement webElement : checkbox) {
            if (!webElement.isSelected()) {
                Sleep();
                webElement.click();
            } else {
                Sleep();
                webElement.click();
            }
        }

        driver.close();
    }
}
