package testing;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1{
public static void main(String[] args) {
	

//	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\selenium workspace\\ancester\\resource\\chromedriver.exe") ;

	WebDriver	drive=new ChromeDriver();
		drive.get("https://testautomationpractice.blogspot.com/");
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		drive.manage().window().maximize();

		drive.findElement(By.cssSelector("#name")).sendKeys("pavi ");
		drive.findElement(By.id("email")).sendKeys("pavi@123");
		drive.findElement(By.id("female")).click();
		drive.findElement(By.id("saturday")).click();
		System.out.println("entering and clicking sucessful cmplted" );
		

		drive.close();

	}

}




