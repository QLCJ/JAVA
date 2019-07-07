package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class huohu {
     public static void main(String[] arg){
    	 WebDriver driver;
    	 System.setProperty("webdriver.gecko.driver", "D:\\ready\\geckodriver.exe");
    	 driver = new FirefoxDriver();
    	 driver.get("https://www.baidu.com");
    	 driver.findElement(By.id("kw")).sendKeys("selenium");
    	 driver.findElement(By.id("su")).click();
     }
}
