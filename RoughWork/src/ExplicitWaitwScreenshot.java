import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ExplicitWaitwScreenshot {
	static WebDriver driver ;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try{
			System.setProperty("webdriver.chrome.driver", ".\\Resources\\BrowsersDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		WebDriverWait wait = new WebDriverWait(driver, 4);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("ledheadlamp")));
		element.click();
		

		}catch(Exception e){
			
			System.out.println("Element didnt show up hence consider filing a bug");
			
		}finally{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			Files.copy(scrFile, new File(".\\Resources\\Screenshots\\Abhi.png"));
		}


	}

}
