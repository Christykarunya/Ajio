package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//In the Search TAb-Type "Bags" and Press Enter key
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(4000);
		
		//Under Gender-Choose Men Checkbox
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		
		//Under Category-click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		//Print the count of the items found
		String count = driver.findElement(By.className("length")).getText();
		System.out.println("Count of items: "+count);
		
		//Get the list of brand of the products displayed in the page and print the list.
		//use findElements and for each
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println("Size :"+bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			String brandName = webElement.getText();
			System.out.println(brandName);
		}
		Thread.sleep(2000);
		
		//Get the list of names of the bags and print it
		//use findElements and for each
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println("Size :"+bagNameList.size());
		
		for (WebElement webElement2 : bagBrandList) {
			String bagName = webElement2.getText();
			System.out.println(bagName);
			
		}
			Thread.sleep(2000);
		
	}
}
		
			

			
	
		
	


