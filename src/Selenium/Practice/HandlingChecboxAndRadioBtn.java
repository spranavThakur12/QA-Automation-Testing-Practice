package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingChecboxAndRadioBtn extends LaunchBrowsers{

   public static void main(String[] args) {
       launchBrowser("Chrome");
       launchURL("https://register.rediff.com/register/register.php?FormName=user_details");
       WebElement radioBtn1st = driver.findElement(By.xpath("//input[@type='radio'][@value='m']"));
       WebElement radioBtn2nd = driver.findElement(By.xpath("//input[@type='radio'][@value='f']"));
       WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][@class='nomargin']"));

       System.out.println("--------------------Before clicking on radio button's---------------------------");
       System.out.println("1st Radio button is Enabled:--> " + radioBtn1st.isEnabled());
       System.out.println("1st Radio button is Dispalyed:--> " + radioBtn1st.isDisplayed());
       System.out.println("1st Radio button is Selected:--> " + radioBtn1st.isSelected());
       System.out.println("2nd Radio button is Enabled:--> " + radioBtn2nd.isEnabled());
       System.out.println("2nd Radio button is Dispalyed:--> " + radioBtn2nd.isDisplayed());
       System.out.println("2nd Radio button is Selected:--> " + radioBtn2nd.isSelected());
       System.out.println("---------------------After Clicking on radio button----------------------------");
       if (radioBtn1st.isSelected()) {
           radioBtn2nd.click();
       }
       else{
           radioBtn1st.click();
       }
       System.out.println("1st Radio button is Enabled:--> " + radioBtn1st.isEnabled());
       System.out.println("1st Radio button is Dispalyed:--> " + radioBtn1st.isDisplayed());
       System.out.println("1st Radio button is Selected:--> " + radioBtn1st.isSelected());
       System.out.println("2nd Radio button is Enabled:--> " + radioBtn2nd.isEnabled());
       System.out.println("2nd Radio button is Dispalyed:--> " + radioBtn2nd.isDisplayed());
       System.out.println("2nd Radio button is Selected:--> " + radioBtn2nd.isSelected());

       if(checkbox.isSelected()){
           checkbox.click();
           System.out.println("Check box is selected:--> "+ checkbox.isSelected());
       }else{
           checkbox.click();
           System.out.println("Check box is selected:--> "+ checkbox.isSelected());
       }


       Sleep();
       driver.close();
   }
}