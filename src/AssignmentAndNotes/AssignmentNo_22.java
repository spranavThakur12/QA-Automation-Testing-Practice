package AssignmentAndNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class AssignmentNo_22 extends LaunchBrowsers{
    public static void main(String[] args) {
        launchBrowser("Chrome");
        driver.manage().window().maximize();
        launchURL(" https://www.istqb.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("====================About=======================");
        // initializing action class
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[2]"));
        List<WebElement> allNavElem = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li"));
         act.moveToElement(allNavElem.get(1)).build().perform();
         List<WebElement> aboutLinkFstSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[2]/div/div/div/div[1]/ul/li"));
          for(WebElement abtElem1sec : aboutLinkFstSec){
              System.out.println(abtElem1sec.getText());
          }
          List<WebElement> aboutLinkScndSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[2]/div/div/div/div[2]/ul/li"));
          for(WebElement abtElem2sec : aboutLinkScndSec){
              System.out.println(abtElem2sec.getText());
          }
          Sleep();
          System.out.println("========================Foundation=========================");
            act.moveToElement(allNavElem.get(2)).build().perform();
          List<WebElement> foundationFstSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[3]/div/div/div/div[1]/ul/li"));
           for(WebElement fondsn1sec : foundationFstSec){
               System.out.println(fondsn1sec.getText());
           }
        List<WebElement> foundationScndSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[3]/div/div/div/div[2]/ul/li"));
        for(WebElement fondsn2sec : foundationScndSec){
            System.out.println(fondsn2sec.getText());
        }
        Sleep();
        System.out.println("=====================Advanced======================");
        act.moveToElement(allNavElem.get(3)).build().perform();
        List<WebElement> advancedFrstSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[4]/div/div/div/div[1]/ul/li"));
        for(WebElement advncd1Sec : advancedFrstSec){
            System.out.println(advncd1Sec.getText());
        }
        List<WebElement> advancedScndSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[4]/div/div/div/div[2]/ul/li"));
        for(WebElement advncd2Sec : advancedScndSec){
            System.out.println(advncd2Sec.getText());
        }
        WebElement advancedThrdSec = driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[4]/div/div/div/div[3]/ul/li[1]"));
        System.out.println(advancedThrdSec.getText());
        Sleep();
        System.out.println("==========================Agile=========================");
        act.moveToElement(allNavElem.get(4)).build().perform();
        List<WebElement> agileFstSec =driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[5]/div/div/div/div[1]/ul/li"));
        for(WebElement agile1Sec : agileFstSec){
            System.out.println(agile1Sec.getText());
        }
        List<WebElement> agileScndSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[5]/div/div/div/div[2]/ul/li"));
        for(WebElement agile2Sec : agileScndSec){
            System.out.println(agile2Sec.getText());
        }
        Sleep();
        System.out.println("============================Specialist==========================");
        act.moveToElement(allNavElem.get(5)).build().perform();
        List<WebElement> speclistSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li"));
        for(WebElement speclist1Sec : speclistSec){
            System.out.println(speclist1Sec.getText());
        }
        System.out.println("=============================New Certification======================");
        act.moveToElement(allNavElem.get(6)).build().perform();
        List<WebElement> newCertiFst = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[7]/div/div/div/div[1]/ul/li"));
        for(WebElement newCerti1Sec : newCertiFst){
            System.out.println(newCerti1Sec.getText());
        }
        List<WebElement> newCertiSec = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[7]/div/div/div/div[2]/ul/li"));
        for(WebElement newCerti2Sec : newCertiSec){
            System.out.println(newCerti2Sec.getText());
        }
        Sleep();
        driver.quit();
    }
}
