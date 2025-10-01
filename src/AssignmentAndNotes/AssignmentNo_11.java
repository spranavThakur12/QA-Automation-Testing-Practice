package AssignmentAndNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class AssignmentNo_11 extends LaunchBrowsers {
    public static void main(String[] args) {
        launchBrowser("chrome");
        launchURL("https://www.redbus.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //! Source Place
        WebElement from = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[1]"));
        from.click();
        WebElement inputFrom = driver.findElement(By.cssSelector("input[class^='inputField'][id^='srcDest']"));
        inputFrom.sendKeys("All");
        WebElement startForm = driver.findElement(By.cssSelector("div[role='heading'][aria-label^='Allahabad']"));
        startForm.click();


        //! Destination Place
        WebElement to = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[2]"));
        to.click();
        WebElement inputTo = driver.findElement(By.xpath("//*[@id='srcDest']"));
        inputTo.sendKeys("Pune");
        WebElement destnination = driver.findElement(By.cssSelector("div[role='heading'][aria-label^='Viman Nagar']"));
        destnination.click();


        //?date selecting
        WebElement date = driver.findElement(By.xpath("//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]"));
        date.click();

        String monthYear = "Jaunary 2026";
        WebElement monthYear = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/div/div/p[1]"));

        while (!monthYear.getText().equals(monthYear)) {
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/div/i[2]")).click();
        }

        WebElement chooseDate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[10]/div/div/span"));
        chooseDate.click();
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/button"));
        search.click();
//          WebElement name = driver.findElement(By.xpath("//*[@id='35778962']"));
        List<WebElement> noBuses = driver.findElements(By.xpath("//*[@id='searchContentWrap']/div/div"));
        for(WebElement element: noBuses){
            System.out.println(element.getText());
        }
        driver.close();
    }
}
// /html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[10]/div/div/span
