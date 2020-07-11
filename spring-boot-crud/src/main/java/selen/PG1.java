package selen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "localhost:8080";
		String expectedTitle = "Users";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
