package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddOwnerwithpet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GTS\\Desktop\\CH -ISTQB\\Advanced level\\Selenium\\Setup\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petclincqpros.herokuapp.com/owners/find");	
        driver.findElement(By.partialLinkText("Add Owner")).click();					
        driver.findElement(By.id("firstName")).sendKeys("Hala");
        driver.findElement(By.id("lastName")).sendKeys("test");
        driver.findElement(By.id("address")).sendKeys("Amman");
        driver.findElement(By.id("city")).sendKeys("Amman");
        driver.findElement(By.id("telephone")).sendKeys("07970302");
	    driver.findElement(By.xpath("(//button[@type='submit'])")).click();
        driver.findElement(By.partialLinkText("Add New Pet")).click();					
        driver.findElement(By.id("name")).sendKeys("Cat");
        driver.findElement(By.id("birthDate")).sendKeys("2020-02-07");
	    driver.findElement(By.xpath("(//button[@type='submit'])")).click();
	    
	    String ActualResultName = driver.findElement(By.xpath("/html/body/div/div/table[1]/tbody/tr[1]/td")).getText();    
	    String ExpectedResultName="Hala test";
	    
	   if (ActualResultName.equals(ExpectedResultName)) { 
		    System.out.print(ActualResultName);
		    
		}
	   
	   
	    String ActualResultAddress = driver.findElement(By.xpath("/html/body/div/div/table[1]/tbody/tr[2]/td")).getText();    
	    String ExpectedResultAddress="Amman";
	    
	   if (ActualResultAddress.equals(ExpectedResultAddress)) { 
		    System.out.print(ActualResultAddress);
		    
		}

	   
	   
	    String ActualResultcity = driver.findElement(By.xpath("/html/body/div/div/table[1]/tbody/tr[3]/td")).getText();    
	    String ExpectedResultcity="Amman";
	    
	   if (ActualResultcity.equals(ExpectedResultcity)) { 
		    System.out.print(ActualResultcity);
		    
		} 
	   
	   
	   
	   
	    String ActualResulttelephone = driver.findElement(By.xpath("/html/body/div/div/table[1]/tbody/tr[4]/td")).getText();    
	    String ExpectedResulttelephone="07970302";
	    
	   if (ActualResultAddress.equals(ExpectedResulttelephone)) { 
		    System.out.print(ActualResulttelephone);
		    
		}
	   
	   
	     
	   
	    String ActualResultname = driver.findElement(By.xpath("/html/body/div/div/table[2]/tbody/tr/td[1]/dl/dd[1]")).getText();    
	    String ExpectedResultname="Cat";
	    
	   if (ActualResultname.equals(ExpectedResultname)) { 
		    System.out.print(ActualResultname);
		    
		}
	   
	   
	   
	   
	    String ActualResultbirthDate = driver.findElement(By.xpath("/html/body/div/div/table[2]/tbody/tr/td[1]/dl/dd[2]")).getText();    
	    String ExpectedResultbirthDate="2020-02-07";
	    
	   if (ActualResultbirthDate.equals(ExpectedResultbirthDate)) { 
		    System.out.print(ActualResultbirthDate);
		    
		}
	   
	      
	   
	   
	   
}}
