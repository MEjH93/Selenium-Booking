import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main {
	
	public static void main(String[] args) {
		
		WebDriverChrome chrome = new WebDriverChrome();
		chrome.getDriver().navigate().to("http://www.booking.com/");  
         
        chrome.getDriver().findElement(By.id("ss")).sendKeys("Paris");
        
        chrome.getDriver().findElement(By.xpath("//html")).click();
        
        chrome.getDriver().findElement(By.className("xp__dates-inner")).click();
    
        chrome.svgClicks();
        if(chrome.getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[2]")).isEnabled()) {
        	chrome.getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[2]")).click();
        }else {
        	//nesto
        }
        chrome.getDriver().findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[5]/td[1]")).click();
        chrome.getDriver().findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span[2]")).click();
        chrome.getDriver().findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/button[2]")).click();
        chrome.getDriver().findElement(By.className("sb-searchbox__button")).click(); 
        chrome.getDriver().findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[2]")).click();

	}
}
