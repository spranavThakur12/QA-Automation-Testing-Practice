package AssignmentAndNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AssignmentNo_10 extends LaunchBrowsers{
    public static void main(String[] args) {
        launchBrowser("Chrome");
        launchURL("https://omayo.blogspot.com/");
        WebElement mutipleSelect = driver.findElement(By.cssSelector("#multiselect1"));
        Select multiOption = new Select(mutipleSelect);
        List<WebElement> allOption = multiOption.getOptions();
        for(int i=0; i<allOption.size(); i++){
            multiOption.selectByIndex(i);
        }
        multiOption.deselectAll();
        multiOption.selectByVisibleText("Volvo");
        multiOption.selectByVisibleText("Audi");
        System.out.print("Selected Options are:--> ");
        List<WebElement>selectText = multiOption.getAllSelectedOptions();
        for(WebElement element: selectText){
            System.out.print(element.getText() +"\t");
        }
        Sleep();
        driver.close();
    }
}
