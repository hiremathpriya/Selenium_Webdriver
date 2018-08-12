import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");//hit url on browser
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("India");

	}

}
