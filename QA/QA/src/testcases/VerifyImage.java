package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyImage {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GTS\\Desktop\\CH -ISTQB\\Advanced level\\Selenium\\Setup\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petclincqpros.herokuapp.com/");


		WebElement ImageFile = driver.findElement(By.ByXPath.className("img-responsive"));
       
		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
		    if (!ImagePresent)
		    {
		         System.out.println("Image not displayed.");
		    }
		    else
		    {
		        System.out.println("Image displayed.");
		    }
		 
		 
		 
	}

}
