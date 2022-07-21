import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TesteGoogle2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arribeiro\\Downloads\\chromedriver_win32\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();	
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
