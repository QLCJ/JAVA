package Web;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WDTest02 {
	
	        WebDriver driver;		
		    @Before
			  public void setUp() throws Exception {
			 System.setProperty("webdriver.gecko.driver", "D:\\ready\\geckodriver.exe");
				 driver = new FirefoxDriver();
		    }
		   //第一部分
		    @Test
		    public  void demo1() throws InterruptedException {
		    //打开去哪儿网首页
		    driver.get("https://www.qunar.com/");
			 Thread.sleep(3000);
		    //出发城市/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input
		    driver.findElement(By.name("fromCity")).sendKeys("南京(NKG)");
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[3]")).click();
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[3]")).click();
		    //到达城市
		    driver.findElement(By.name("toCity")).sendKeys("北京(BJS)");
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/div[3]")).click();
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/div[3]")).click();
		    //出发日期
		 	driver.findElement(By.id("js_domestic_fromdate")).sendKeys(Keys.CONTROL, "a");  
		 	driver.findElement(By.id("js_domestic_fromdate")).sendKeys("2018-06-01");	
		     //查询
		 	driver.findElement(By.className("button-search")).click();
		 	 Thread.sleep(3000);
		 	 //选择直飞
		     driver.findElement(By.className("lab")).click();	  
		 	//第二部分
		     //后退
		 	driver.navigate().back(); 
		 	 //点击机票
		 	 driver.findElement(By.id("__link_flight__")).click();
		 	 //选择往返
		 	 driver.findElement(By.id("searchTypeRnd")).click();
		 	 //返程日期
		 	 driver.findElement(By.id("toDate")).sendKeys(Keys.CONTROL, "a");  
		 	 driver.findElement(By.id("toDate")).sendKeys("2018-06-05");
			 //查询
		 	 driver.findElement(By.className("btn_search")).click();
		 	 Thread.sleep(3000);	
		 	//第三部分
		 	 //后退
		 	driver.navigate().back(); 	 
		 	 //选择港澳台机票
		 	 driver.findElement(By.id("js_inter_tab")).click();
			 Thread.sleep(1000);
			 //出发城市
		     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).sendKeys("南京(NKG)");	
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		 	 // 达到城市
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("洛杉矶(LAX)");			
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();	
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
			 //出发日期
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys(Keys.CONTROL, "a");  
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys("2018-06-10");
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
			 Thread.sleep(1000);
			 //回城日期
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2018-06-15");
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
			 Thread.sleep(1000);
			 //查询
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		 	 Thread.sleep(3000);
		 	//第四部分
		 	 //后退
		 	driver.navigate().back(); 
		 	//改变回城日期
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2018-06-20");
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
			//设置成人数量
		 	 driver.findElement(By.name("adultNum")).click();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[2]/ul/li[2]")).click();
		 	 //设置儿童数量
		 	 driver.findElement(By.name("childNum")).click();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[2]/ul/li[2]")).click();
		 	 //查询
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		 	 //封装一个遍历查询页面元素的方法，判断是否存在直飞航班，在控制台打印结果
		 //	 Judge p=new Judge();
		 //	 if( p.isContentAppeared(driver, "直飞")) System.out.print("有航班直达");
		//	 else System.out.print("无航班直达");
		 	//第五部分
		 	 //后退
		 	 driver.navigate().back(); 
			 //选择多程
			 driver.findElement(By.id("searchTypeMulti")).click();
			 //出发城市
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("南京");
		 	 Thread.sleep(1000);
		 	 //出发日期
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys("2018-06-20");
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		 	 Thread.sleep(1000);
		 	 //回程时出发城市
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("洛杉矶(LAX)");
		 	// Thread.sleep(1000);
		 	 //回程时到达城市
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).sendKeys("上海(SH)");
		 	 Thread.sleep(1000);
		 	 //回程时出发日期
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys("2018-06-30");
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		 	 Thread.sleep(1000);
		 	 //查询
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		 	 Thread.sleep(5000);
		 	 //第六部分
		 	  //第一程选择第一个报价
			 driver.manage().window().maximize(); 
		 	 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b")).click();  
				 Thread.sleep(5000);
		 	 //第二程选择东方航空的 
		 	 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]")).click();
		 	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,200)"); 
		 	 Thread.sleep(5000);
		    driver.findElement(By.cssSelector("input[value=MU]")).click();
			 Thread.sleep(5000);
		  //第七部分
		 	  //选择第一个报价
			 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[7]/div/a/span/b")).click();
			 Thread.sleep(5000);
			 //预定
			 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[4]/div[2]/div[4]/div/div[2]/div/div[6]/div[3]/div/div/div[1]/a")).click();
		    }
		
		}
	    

