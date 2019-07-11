package firefox;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Web {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D:\\AAPP\\firefox\\ready\\geckodriver.exe");
		driver = new FirefoxDriver();                //打开火狐
		driver.navigate().to("https://www.qunar.com/");
		driver.manage().window().maximize();        //放大浏览器
		
		//转到网址
		driver.get("https://www.qunar.com/");
	
//第一部分		
		//出发城市
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).sendKeys("南京(NKG)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//目的地
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).sendKeys("北京(BJS)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//出发时间
		//driver.findElement(By.name("fromDate")).click();
		driver.findElement(By.name("fromDate")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.name("fromDate")).sendKeys("2019-08-1");
		Thread.sleep(3000);
		//点击搜索
		driver.findElement(By.className("button-search")).click();
		Thread.sleep(3000);
		//点击直飞
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/div[5]/label/span")).click();
		Thread.sleep(3000);
			
//第二部分	
		//点击返回
		driver.navigate().back();
		Thread.sleep(2000);
		//点击机票
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/a/span/b")).click();
		Thread.sleep(2000);
		//点击往返
		driver.findElement(By.xpath("//*[@id=\"js_lab_rng\"]")).click();
		Thread.sleep(2000);
		//设置返程时间
		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys("2019-11-1");
		Thread.sleep(3000);
		//点击搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[4]/button")).click();
		Thread.sleep(3000);
//第三部分
		//返回上一级
		driver.navigate().back();
		Thread.sleep(2000);
		//点击港澳台
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//出发城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).sendKeys("南京(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		Thread.sleep(3000);
		//目标城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("洛杉矶(LAX)");
		//driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("普吉(HKT)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//出发时间 
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys("2019-11-01");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).click();
		Thread.sleep(3000);
		//返程时间                   
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-11-14");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(3000);
		//点击搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(3000);
		
//第四部分
		//返回到上一界面
		driver.navigate().back();
		Thread.sleep(2000);
		//更改返程日期
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-11-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(3000);
		//添加成人数量
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[2]/ul/li[2]")).click();
		Thread.sleep(3000);
		//添加儿童数量
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[2]/ul/li[2]")).click();
		Thread.sleep(3000);
		//点击搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(2000);
		//判断是否有直飞并在控制台输出
		try {
			driver.findElement(By.className("lab"));
			System.out.println("有直达航班");
		}catch(Exception e) {
			System.out.println("无直达航班");
		}	
		Thread.sleep(2000);
		
//第五部分                   
		//返回上一届界面
		driver.navigate().back();
		Thread.sleep(2000);
		//点击多程
		driver.findElement(By.id("searchTypeMulti")).click();
		Thread.sleep(2000);
		//第一程出发城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("南京(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		//目的地
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).sendKeys("洛杉矶(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		//出发日期
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys("2019-11-09");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//第二程出发城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("洛杉矶(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//目的城市
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).sendKeys("上海(SHA)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		Thread.sleep(3000);
		//出发时间
		//driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys("2019-11-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//点击搜索
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(5000);
		
//第六部分
		//点击第一个航班的 选择 按钮                                                  /html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b      
		driver.findElement(By.cssSelector("html body div#j-pagecontainer.q_pagecontainer div.q_pagewrap div.q_page div.l_lside div#list-box.m-cheng-dtl div.js-fl-box div#js-avt-lst.ch-bd div.m-avt-wrap.js-avt-wrap div.js-item div.m-avt.m-avt-v1 div.c6 div.a_booking a.btn.js-select-pr span b")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b")).click();
		Thread.sleep(3000);
		//下拉使航空公司的显示更加完全
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		//点击航班公司  (第二程要求航班公司)
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]")).click();
		Thread.sleep(3000);
		//选择   东方航空
		driver.findElement(By.xpath("//*[@class=\"list\"]/ul[position()>0 and position()<5]/li[position()>0 and position()<9]//*[text()='东方航空']")).click();
		Thread.sleep(3000);
		
//第七部分
		//点击航班信息的第一个航班的  选择  按钮
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[7]/div/a/span/b")).click();
		Thread.sleep(8000);
		//点击第一个全程航班的 预定 按钮
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[4]/div[2]/div[4]/div/div[2]/div/div[6]/div[3]/div/div/div[1]/a")).click();
		Thread.sleep(8000);
		
		
		//跳转到订单网址
		//driver.get("https://pangolin.flight.qunar.com/flightns/pangolin/booking?bk=fa7f1307d1104d05b29fb199168b9685%5E3e52990f7bff45058635df8295b99310&qt=9ed9ccc8388b02mA%5E9ed9ccc8388c02mA&bksource=&type=1");
		//Thread.sleep(8000);
		
		 
		//切换浏览器标签            还可以用 Keys 控制键盘的   CTRL+TAB    也可以切换标签
		Set<String>winHandels = driver.getWindowHandles();       //得到当前窗口的set集合
		List<String> it = new ArrayList<String>(winHandels);     //将set集合存入list对象
		driver.switchTo().window(it.get(1));                     //切换到弹出的新窗口
	/*	String urll = driver.getCurrentUrl();                    //获取当前页面的url   
		driver.switchTo().window(it.get(0));                     //返回至原页面             这两步骤不需要         */
		Thread.sleep(8000);
		
		
		//截图
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(srcFile, new File("C:\\屏幕截图",".png"));
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
