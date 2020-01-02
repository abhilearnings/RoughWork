import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.setProperty("webdriver.chrome.driver", ".\\Resources\\BrowsersDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		WebDriverWait wait = new WebDriverWait(driver, 4);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("ledheadlamp")));
		//WebElement element = wait.until(ExpectedConditions.(By.name("ledheadlamp")));
		element.click();
		}
		catch(Exception e){
			
			System.out.println("Element didnt show up hence consider filing a bug");
			
		}


	}

}
