package seleniumInto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInvocation {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); */
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		//List<WebElement> list = driver.findElements(By.tagName("a"));// total number of links in a page
		//List<WebElement> list = driver.findElements(By.tagName("img"));
		//List<WebElement> list = driver.findElements(By.xpath("//input[@type='text']"));//total number of text boxes
		//List<WebElement> list = driver.findElements(By.tagName("Select"));//Total number of dropdowns
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));//Total number of checkboxes
		System.out.println(list.size());
	}

}
