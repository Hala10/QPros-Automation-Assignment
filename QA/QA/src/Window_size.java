import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GTS\\Desktop\\CH -ISTQB\\Advanced level\\Selenium\\Setup\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://martix.me/");
		
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();

		
		
		
		
	}

}
