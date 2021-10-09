import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Methods {
	

	
	public static void main(String[] args){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\GTS\\Desktop\\CH -ISTQB\\Advanced level\\Selenium\\Setup\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("http://martix.me/");


// Checking on URL
String CurrentUrl= driver.getCurrentUrl();

if (CurrentUrl.contentEquals("https://store.martix.me/home")) {
	System.out.println("T");

}
else {
	System.out.println("F");

}



//Checking on Page title 
String title = driver.getTitle();
System.out.println(title);


// Show page Source code 

String Source = driver.getPageSource();
System.out.println(Source);


	}
}


