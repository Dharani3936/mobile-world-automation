package into;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sellintrodiction {

	public static void main(String[] args) {

		//invoke Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		//invoking browser
		//webdriver.chrome.driver
		WebDriver driver=new ChromeDriver();
		
		//firefox driver
		//geckodriver
		
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\bhavadharani.p\\\\OneDrive - Qualitest Group\\\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//microsoft driver
		//edgedriver
		
		//webdriver.edge.driver
		//System.setProperty("webdriver.edge.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
	}

}
