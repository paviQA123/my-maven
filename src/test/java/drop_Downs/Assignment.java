package drop_Downs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.findElement(By.cssSelector("#country-list")).click();
		driver.findElement(By.xpath("//select[@id='country-list']/option[text()='China']")).click();
//		List<WebElement> countries=driver.findElements(By.cssSelector("#country-list>option"));
//		
//		System.out.println("No.of countries : "+countries.size());
//		System.out.println("********");
//		
//		 System.out.println("countrie names : ");
//		/*for(WebElement country:countries) {
//		 * syso
//			System.out.println(country.getText());
//		
//			boolean con=country.getText().equals("France");
//			
//
//			if(con) {
//			
//				country.click();
//				System.out.println(country.getAttribute("value"));
//			
//			}
//		}*/
//		
//		
//		
//	
//         for(int i=0;i<countries.size();i++) {
//        	
//        	 System.out.println(countries.get(i).getText());
//        boolean 	coun= countries.get(i).getText().contains("Brazil");
//        	 if(coun) {
//        		 countries.get(i).click();
//        		
//        	 }
//        	Thread.sleep(3000);
//        	 if(countries.get(i).getText().contains("USA")) {
//        		 countries.get(i).click();
//        		 
//        	 }
//        		 Thread.sleep(3000);
//            	 if(countries.get(i).getText().contains("France")) {
//            	
//            		 countries.get(i).click();
//            		 
//        	 }
//          }
//
//         
//         List<WebElement> countries=driver.findElements(By.cssSelector("#country-list>option"));
// 		
// 		System.out.println("No.of countries : "+countries.size());
// 		System.out.println("********");
// 		
// 		 System.out.println("countrie names : ");
// 		/*for(WebElement country:countries) {
// 		 * syso
// 			System.out.println(country.getText());
// 		
// 			boolean con=country.getText().equals("France");
// 			
//
// 			if(con) {
// 			
// 				country.click();
// 				System.out.println(country.getAttribute("value"));
// 			
// 			}
// 		}
//		
		
	}
	}

