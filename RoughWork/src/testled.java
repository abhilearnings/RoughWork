import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\BrowsersDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		//driver.findElement(By.xpath("//*[@id='tabs-1']/p[3]/input[4]")).click();
		WebElement ele = driver.findElement(By.name("ledheadlamp"));
		System.out.println(ele.isEnabled());

	}

}
