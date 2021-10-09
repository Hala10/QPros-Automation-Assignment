import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GTS\\Desktop\\CH -ISTQB\\Advanced level\\Selenium\\Setup\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://store.martix.me/product/165994");
		
		
		
        //driver.findElement(By.id("«·ﬁÌ«”_40")).click();


      driver.findElement(By.xpath("//*[@id=\"«·ﬁÌ«”_40\"]")).click();

       
       
       
		driver.close();

		
     //   List <WebElement> listOfElements =driver.findElements(By.ByXPath.id("//span[@class='radio']"));
       // listOfElements.get(0).click();
        
        
        
       
       
		driver.quit();

      //  List <WebElement> listOfElements =driver.findElements(By.ByXPath.id("//input[@type='radio']"));
      //  listOfElements.get(5).click();

		
		

		
	}

}
