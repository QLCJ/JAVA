package firefox;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; //时间控件
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {
	public static void main(String[] args) throws InterruptedException, Exception {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\AAPP\\firefox\\ready\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();  
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); 
		
		//转到网址
		driver.get("https://www.qunar.com/");

		

//第1个
		//选择出发地址
			      /*  
				                  定位到 KLMNP  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[4]/div/div[2]/div[1]/span[4]")).click();
				                  定位到 N      driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[4]/div/div[2]/div[5]/dl[4]/dt")).click();
				                  定位到南京            driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[4]/div/div[2]/div[5]/dl[4]/dd/ul/li[1]/a")).click();
			      */               
		
		driver.findElement(By.name("fromCity")).sendKeys("南京(NKG)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//选择目的
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).sendKeys("北京(BJS)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//选择时间   1、先点击日期框 2、xpath定位到想要的日期
		//driver.findElement(By.xpath("//*[@id=\"js_domestic_fromdate\"]")).sendKeys("2019-08-01");
		driver.findElement(By.id("js_domestic_fromdate")).sendKeys(Keys.CONTROL, "a");  
	 	driver.findElement(By.id("js_domestic_fromdate")).sendKeys("2019-08-01");
		
		//driver.findElement(By.xpath("//*[@id=\"js_domestic_fromdate\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"js_flight_domestic_searchbox\"]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]/table/tbody/tr[3]/td[1]/div/span")).click();
		Thread.sleep(2000);
		//点击搜索
		driver.findElement(By.className("button-search")).click();
		Thread.sleep(2000);
		//选择直飞
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/div[5]/label/span")).click();
		Thread.sleep(2000);

		

//第2个
		//返回到上一级(去哪儿网首页)
		driver.navigate().back();
		Thread.sleep(2000);
		//点击最上方的机票
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/a/span/b")).click();
		Thread.sleep(2000);
		//点击往返
		driver.findElement(By.xpath("//*[@id=\"js_lab_rng\"]")).click();
		Thread.sleep(2000);
		//选择出发地
		driver.findElement(By.name("fromCity")).sendKeys("南京(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[1]/div/input")).click();
		Thread.sleep(2000);
		//选择目的
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[2]/div/input")).sendKeys("北京(BJS)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//选择出发时间   1、先点击日期框 2、xpath定位到想要的日期
		//driver.findElement(By.xpath("//*[@id=\"js_domestic_fromdate\"]")).sendKeys("2019-08-01");
		driver.findElement(By.id("fromDate")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.id("fromDate")).sendKeys("2019-08-01");
		Thread.sleep(2000);
		//选择返回时间
		driver.findElement(By.id("toDate")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.id("toDate")).sendKeys("2019-11-01");
		Thread.sleep(2000);
		//点击立即搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[4]/button")).click();
		Thread.sleep(2000);
		
		
		
		
		
	
		
	
//第3个				
		//返回到上一级
		driver.navigate().back();
		Thread.sleep(2000);
		//点击国际·港澳台机票
	 	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//点击往返
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[1]/label[2]")).click();
		Thread.sleep(2000);
		//选择出发地
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).sendKeys("南京(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		Thread.sleep(2000);
		//选择目的
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("洛杉矶(LAX)");
		//测试直飞driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("大阪(OSA)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//选择出发时间   1、先点击日期框 2、xpath定位到想要的日期
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys("2019-11-01");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		Thread.sleep(2000);
		//选择返回时间
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-12-01");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(2000);
		
		//点击立即搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(2000);	
		
		

//第4个		
		//返回到上一级
		driver.navigate().back();
		Thread.sleep(2000);
		//更改返回时间
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-12-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(2000);
		//设置成人数量
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[2]/ul/li[2]")).click();
		Thread.sleep(2000);
		//设置儿童数量
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[2]/ul/li[2]")).click();
		Thread.sleep(2000);
		//点击搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(2000);
		//判断是否有直飞
		try {
			driver.findElement(By.className("lab"));
			System.out.println("有直达航班");
		}catch(Exception e) {
			System.out.println("无直达航班");
		}
		
	
   
		
		
//第5个
		//返回到上一级
		driver.navigate().back();
		Thread.sleep(2000);
		//选择多程(含缺口)
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[1]/label[4]")).click();
		Thread.sleep(2000);
		//第一程   南京(NKG)至洛杉矶(LAX)
		//出发城市                   /html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("南京(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//目的城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).sendKeys("洛杉矶(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		Thread.sleep(2000);
		//出发时间
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys("2019-12-09");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		
		//第二程   洛杉矶(LAX)至上海(SHA)
		//出发城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("洛杉矶(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//目的城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).sendKeys("上海(SHA)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		Thread.sleep(2000);
		//出发时间
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys("2019-12-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//点击搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
//第六部分
		
		
		//driver.get("http://flight.qunar.com/site/multi_trip_inter.htm?fromCity=%E5%8D%97%E4%BA%AC%2C&toCity=%E6%B4%9B%E6%9D%89%E7%9F%B6%2C%E4%B8%8A%E6%B5%B7&fromDate=2019-12-09,2019-12-15&fromCode=NKG,LAX&toCode=LAX,SHA&from=flight_int_search");
		//Thread.sleep(2000);
		//driver.manage().window().maximize(); 
		//选择第一程中的第一个航班
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b")).click();
		Thread.sleep(3000);
		
		
		//下拉    (必须下拉才能定位到)
		WebElement webElement = driver.findElement(By.cssSelector("body"));
		webElement.click(); // 有的时候必须点击一下，下拉才能生效（有的网站是这样，原因未找到）
		//小幅度ARROW_DOWN
		webElement.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		
		
		//下拉                                                       从0到500   0到0是到顶部                                                                          						          从0到X        (0,0)是拉到顶部
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");

		
		//第二程中选择航空公司     点击航空公司          /html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]")).click();
		//driver.findElement(By.cssSelector("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[2]/ul[1]/li[2]/label")).click();
		Thread.sleep(2000);
		
		//选择东方航空            不行就在xpath前加入css            
		//OK的     html body div#j-pagecontainer.q_pagecontainer div.q_pagewrap div.q_page div.l_lside div#list-box.m-cheng-dtl div.js-fl-box div#js_condition.m-condition div.m-condition-bd div#filter_ca.g-down div.g-down div.target		
		//driver.findElement(By.cssSelector("html body div#j-pagecontainer.q_pagecontainer div.q_pagewrap div.q_page div.l_lside div#list-box.m-cheng-dtl div.js-fl-box div#js_condition.m-condition div.m-condition-bd div#filter_ca.g-down div.g-down div.list ul li label")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[2]/ul[2]/li[6]/label")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[2]/ul[2]/li[6]/label")).click();
		//Thread.sleep(2000);
		
		
		
		
		//东方航空
		driver.findElement(By.xpath("//*[@class=\"list\"]/ul[position()>0 and position()<5]/li[position()>0 and position()<9]//*[text()='东方航空']")).click();
		Thread.sleep(3000);
		
		
		
		
		//选择第二程
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[7]/div/a/span/b")).click();
		Thread.sleep(3000);
		
		//预定
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[4]/div[2]/div[4]/div/div[2]/div/div[6]/div[3]/div/div/div[1]/a")).click();
		Thread.sleep(9000);
		
		 
		
	
		//转到订单网址  截屏
		driver.get("https://pangolin.flight.qunar.com/flightns/pangolin/booking?bk=c378cd3120e9473ea4bde14a12cd245f%5E64f403c3b8de449ba3385f97b4b67096&qt=9cd66bb9507602mA%5E9cd66bb9507702mA&bksource=&type=1");
		Thread.sleep(8000);
		
		//截图
		
				File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFileToDirectory(srcFile, new File("C:\\屏幕截图",".png"));
				Thread.sleep(3000);
		
		
		
	/*	
		
		
		driver.get("https://www.qunar.com/");
		//点击最上方的机票
				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/a/span/b")).click();
				Thread.sleep(2000);
				//点击国际·港澳台机票
				driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[2]/ul/li[2]/a")).click();
				Thread.sleep(2000);
	
	*/	

		
		
		
	}

}