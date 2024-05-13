package window_Maximize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Maximize {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions options =new  ChromeOptions();
	options.addArguments("start-maximize");
		WebDriver driver=new ChromeDriver();
		
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.close();
//		
	}

}
