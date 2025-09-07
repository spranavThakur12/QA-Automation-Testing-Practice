package WebDriver_Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practical1_Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		// waiting for 2 second
		Thread.sleep(2000);
		//To close the driver 
		driver.close();
	}

}
