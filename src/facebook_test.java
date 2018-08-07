import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");//hit url on browser
		driver.findElement(By.id("email")).sendKeys("this is my first code");
		driver.findElement(By.name("pass")).sendKeys("abacde");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.close();
		
	}

}
