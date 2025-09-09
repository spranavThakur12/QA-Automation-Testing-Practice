package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPractice extends LaunchBrowsers{
    public static void main(String[] args) {
        launchBrowser("Chrome");
        launchURL("https://register.rediff.com/register/register.php?FormName=user_details");
        WebElement dates = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
        Select selectDate = new Select(dates);
        WebElement months = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
        Select selectMonth = new Select(months);
        WebElement years = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
        Select selectYear = new Select(years);
        System.out.println("=====================Default Values Of DOB======================================");
        System.out.println("The default selected option day is:--> "+selectDate.getFirstSelectedOption().getText());
        System.out.println("The default selected option day is:--> "+selectMonth.getFirstSelectedOption().getText());
        System.out.println("The default selected option day is:--> "+selectYear.getFirstSelectedOption().getText());
        System.out.println("============================Selected Value======================================");
        List<WebElement> chooseDate = selectDate.getOptions();
        System.out.println("Total Days are:--> "+chooseDate.size());
        selectDate.selectByVisibleText("12");
        Sleep();
        selectMonth.selectByVisibleText("AUG");
        Sleep();
        selectYear.selectByVisibleText("1999");
        Sleep();
        System.out.print("My Date Of Birth is:--> ");
        System.out.print(selectDate.getFirstSelectedOption().getText() +"\t");
        System.out.print(selectMonth.getFirstSelectedOption().getText()+"\t");
        System.out.print(selectYear.getFirstSelectedOption().getText());

        driver.close();
    }
}
