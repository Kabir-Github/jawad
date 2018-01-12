package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int count = driver.findElements(By.xpath("//input[@name='sex']")).size();
	for (int i = 0; i <count; i++) {
		String name = driver.findElements(By.xpath("//input[@name='sex']")).get(i).getAttribute("value");
		if (name.equals("2")) {
			driver.findElements(By.xpath("//input[@name='sex']")).get(i).click();
		}
	}

}
}
