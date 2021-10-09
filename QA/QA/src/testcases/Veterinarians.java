package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Veterinarians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GTS\\Desktop\\CH -ISTQB\\Advanced level\\Selenium\\Setup\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petclincqpros.herokuapp.com/vets.html");
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='table table-striped']//tr")); 

		for (WebElement row : allRows) { 
		    List<WebElement> cells = row.findElements(By.tagName("td")); 

		    for (WebElement cell : cells) {         

		    System.out.println(cell.getText());

		}	
		
		
		
		


	}}}


