import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverChrome {
	
	private static final String browser = System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEjH\\Desktop\\SeleinumBooking\\chromedriver.exe");  
	private final WebDriver driver=new ChromeDriver();
	
	public static String getBrowser() {
		return browser;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void svgClicks() {
		WebElement a = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[2]"));
        for(int i =0;i < 8;i++) {
        	a.click();
        }
	}
	
}
