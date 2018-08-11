import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("12345");
		//driver.findElement(By.className("button r4 wide primary")).click();//error
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println (driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	}
}