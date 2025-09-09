package AssignmentAndNotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowsers {
    public static WebDriver driver = null;

    public static void launchBrowser(String browserName){
        if(browserName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if(browserName.equalsIgnoreCase("Fire Fox")) {
            driver = new FirefoxDriver();
        } else if(browserName.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else{
            System.out.println("Browser is Null :");
            return ;
        }
        driver.manage().window().maximize();
    }
    public static void launchURL(String appUrl){
        driver.get(appUrl);
    }
    public static void Sleep(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
