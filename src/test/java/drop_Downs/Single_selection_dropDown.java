package drop_Downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_selection_dropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver sdd=new ChromeDriver();
        sdd.manage().window().maximize();
        sdd.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(3000);
      WebElement select=  sdd.findElement(By.cssSelector("[id='course']"));
        Select op=new Select(select);
        op.selectByIndex(0);
        op.selectByValue("net");
        Thread.sleep(3000);
        op.selectByVisibleText("Javascript");
        Thread.sleep(3000);
        String dd=op.getFirstSelectedOption().getText();
        Thread.sleep(3000);
       System.out.println("first selected option : "+ dd);
       System.out.println("hi");
        
	}

}
