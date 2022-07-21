import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TesteGoogle3 {
	
	public static void main(String[] args) {
     	WebDriver driver = new ChromeDriver();	
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
