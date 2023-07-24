package junegit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mTest {
	

	@Test
	public void metd() {
		WebDriver driver;
		System.out.println("Hello welcome to Jenkins");
		Reporter.log("Logs easily accessable", true);
		System.out.println("Initilizing the Google Chrome Driver");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Chrome launched successfully", true);
		driver.get("https://otest.anytimeastro.com/");
		Reporter.log("site open successfully", true);
		driver.quit();
		System.out.println("checking jenkins....");
		//Reporter.log("check git ecent triggered", true);
		Reporter.log("check git event triggered second time", true);
	}

}
