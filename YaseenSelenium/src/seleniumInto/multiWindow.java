package seleniumInto;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class multiWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("FirstName")).sendKeys("Kabir");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("LastName")).sendKeys("Ahmed");
		

	}

}
