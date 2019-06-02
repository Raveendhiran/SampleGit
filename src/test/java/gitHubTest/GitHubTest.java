package gitHubTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitHubTest {
	@Test
	public static void main(String[] args) throws IOException 
	{
	//Takescreenshot interface is used
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com/");
		//getscreenshotas is an interface
		
		//typecast is done here 
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("E:\\seleniumworkplace\\GitHubTest\\Screenshot\\test.jpeg"));
		
		driver.close();

	}
}
