import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyGitLabScreenCapture {
	@Test
	public void myTestScreenGit()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd =new ChromeDriver();
		String baseUrl = "https://www.facebook.com";
		wd.get(baseUrl);
		
	}

}
