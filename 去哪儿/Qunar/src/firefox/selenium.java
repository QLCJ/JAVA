package firefox;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; //ʱ��ؼ�
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
		
		//ת����ַ
		driver.get("https://www.qunar.com/");

		

//��1��
		//ѡ�������ַ
			      /*  
				                  ��λ�� KLMNP  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[4]/div/div[2]/div[1]/span[4]")).click();
				                  ��λ�� N      driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[4]/div/div[2]/div[5]/dl[4]/dt")).click();
				                  ��λ���Ͼ�            driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[4]/div/div[2]/div[5]/dl[4]/dd/ul/li[1]/a")).click();
			      */               
		
		driver.findElement(By.name("fromCity")).sendKeys("�Ͼ�(NKG)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//ѡ��Ŀ��
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).sendKeys("����(BJS)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//ѡ��ʱ��   1���ȵ�����ڿ� 2��xpath��λ����Ҫ������
		//driver.findElement(By.xpath("//*[@id=\"js_domestic_fromdate\"]")).sendKeys("2019-08-01");
		driver.findElement(By.id("js_domestic_fromdate")).sendKeys(Keys.CONTROL, "a");  
	 	driver.findElement(By.id("js_domestic_fromdate")).sendKeys("2019-08-01");
		
		//driver.findElement(By.xpath("//*[@id=\"js_domestic_fromdate\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"js_flight_domestic_searchbox\"]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]/table/tbody/tr[3]/td[1]/div/span")).click();
		Thread.sleep(2000);
		//�������
		driver.findElement(By.className("button-search")).click();
		Thread.sleep(2000);
		//ѡ��ֱ��
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/div[5]/label/span")).click();
		Thread.sleep(2000);

		

//��2��
		//���ص���һ��(ȥ�Ķ�����ҳ)
		driver.navigate().back();
		Thread.sleep(2000);
		//������Ϸ��Ļ�Ʊ
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/a/span/b")).click();
		Thread.sleep(2000);
		//�������
		driver.findElement(By.xpath("//*[@id=\"js_lab_rng\"]")).click();
		Thread.sleep(2000);
		//ѡ�������
		driver.findElement(By.name("fromCity")).sendKeys("�Ͼ�(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[1]/div/input")).click();
		Thread.sleep(2000);
		//ѡ��Ŀ��
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[2]/div/input")).sendKeys("����(BJS)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//ѡ�����ʱ��   1���ȵ�����ڿ� 2��xpath��λ����Ҫ������
		//driver.findElement(By.xpath("//*[@id=\"js_domestic_fromdate\"]")).sendKeys("2019-08-01");
		driver.findElement(By.id("fromDate")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.id("fromDate")).sendKeys("2019-08-01");
		Thread.sleep(2000);
		//ѡ�񷵻�ʱ��
		driver.findElement(By.id("toDate")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.id("toDate")).sendKeys("2019-11-01");
		Thread.sleep(2000);
		//�����������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[4]/button")).click();
		Thread.sleep(2000);
		
		
		
		
		
	
		
	
//��3��				
		//���ص���һ��
		driver.navigate().back();
		Thread.sleep(2000);
		//������ʡ��۰�̨��Ʊ
	 	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[1]/label[2]")).click();
		Thread.sleep(2000);
		//ѡ�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).sendKeys("�Ͼ�(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		Thread.sleep(2000);
		//ѡ��Ŀ��
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("��ɼ�(LAX)");
		//����ֱ��driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("����(OSA)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//ѡ�����ʱ��   1���ȵ�����ڿ� 2��xpath��λ����Ҫ������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys("2019-11-01");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		Thread.sleep(2000);
		//ѡ�񷵻�ʱ��
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-12-01");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(2000);
		
		//�����������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(2000);	
		
		

//��4��		
		//���ص���һ��
		driver.navigate().back();
		Thread.sleep(2000);
		//���ķ���ʱ��
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-12-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(2000);
		//���ó�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[2]/ul/li[2]")).click();
		Thread.sleep(2000);
		//���ö�ͯ����
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[2]/ul/li[2]")).click();
		Thread.sleep(2000);
		//�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(2000);
		//�ж��Ƿ���ֱ��
		try {
			driver.findElement(By.className("lab"));
			System.out.println("��ֱ�ﺽ��");
		}catch(Exception e) {
			System.out.println("��ֱ�ﺽ��");
		}
		
	
   
		
		
//��5��
		//���ص���һ��
		driver.navigate().back();
		Thread.sleep(2000);
		//ѡ����(��ȱ��)
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[1]/label[4]")).click();
		Thread.sleep(2000);
		//��һ��   �Ͼ�(NKG)����ɼ�(LAX)
		//��������                   /html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("�Ͼ�(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//Ŀ�ĳ���
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).sendKeys("��ɼ�(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		Thread.sleep(2000);
		//����ʱ��
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys("2019-12-09");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		
		//�ڶ���   ��ɼ�(LAX)���Ϻ�(SHA)
		//��������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("��ɼ�(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//Ŀ�ĳ���
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).sendKeys("�Ϻ�(SHA)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		Thread.sleep(2000);
		//����ʱ��
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys(Keys.CONTROL, "a");  
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys("2019-12-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		Thread.sleep(2000);
		//�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
//��������
		
		
		//driver.get("http://flight.qunar.com/site/multi_trip_inter.htm?fromCity=%E5%8D%97%E4%BA%AC%2C&toCity=%E6%B4%9B%E6%9D%89%E7%9F%B6%2C%E4%B8%8A%E6%B5%B7&fromDate=2019-12-09,2019-12-15&fromCode=NKG,LAX&toCode=LAX,SHA&from=flight_int_search");
		//Thread.sleep(2000);
		//driver.manage().window().maximize(); 
		//ѡ���һ���еĵ�һ������
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b")).click();
		Thread.sleep(3000);
		
		
		//����    (�����������ܶ�λ��)
		WebElement webElement = driver.findElement(By.cssSelector("body"));
		webElement.click(); // �е�ʱ�������һ�£�����������Ч���е���վ��������ԭ��δ�ҵ���
		//С����ARROW_DOWN
		webElement.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		
		
		//����                                                       ��0��500   0��0�ǵ�����                                                                          						          ��0��X        (0,0)����������
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");

		
		//�ڶ�����ѡ�񺽿չ�˾     ������չ�˾          /html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]")).click();
		//driver.findElement(By.cssSelector("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[2]/ul[1]/li[2]/label")).click();
		Thread.sleep(2000);
		
		//ѡ�񶫷�����            ���о���xpathǰ����css            
		//OK��     html body div#j-pagecontainer.q_pagecontainer div.q_pagewrap div.q_page div.l_lside div#list-box.m-cheng-dtl div.js-fl-box div#js_condition.m-condition div.m-condition-bd div#filter_ca.g-down div.g-down div.target		
		//driver.findElement(By.cssSelector("html body div#j-pagecontainer.q_pagecontainer div.q_pagewrap div.q_page div.l_lside div#list-box.m-cheng-dtl div.js-fl-box div#js_condition.m-condition div.m-condition-bd div#filter_ca.g-down div.g-down div.list ul li label")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[2]/ul[2]/li[6]/label")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[2]/ul[2]/li[6]/label")).click();
		//Thread.sleep(2000);
		
		
		
		
		//��������
		driver.findElement(By.xpath("//*[@class=\"list\"]/ul[position()>0 and position()<5]/li[position()>0 and position()<9]//*[text()='��������']")).click();
		Thread.sleep(3000);
		
		
		
		
		//ѡ��ڶ���
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[7]/div/a/span/b")).click();
		Thread.sleep(3000);
		
		//Ԥ��
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[4]/div[2]/div[4]/div/div[2]/div/div[6]/div[3]/div/div/div[1]/a")).click();
		Thread.sleep(9000);
		
		 
		
	
		//ת��������ַ  ����
		driver.get("https://pangolin.flight.qunar.com/flightns/pangolin/booking?bk=c378cd3120e9473ea4bde14a12cd245f%5E64f403c3b8de449ba3385f97b4b67096&qt=9cd66bb9507602mA%5E9cd66bb9507702mA&bksource=&type=1");
		Thread.sleep(8000);
		
		//��ͼ
		
				File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFileToDirectory(srcFile, new File("C:\\��Ļ��ͼ",".png"));
				Thread.sleep(3000);
		
		
		
	/*	
		
		
		driver.get("https://www.qunar.com/");
		//������Ϸ��Ļ�Ʊ
				driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/a/span/b")).click();
				Thread.sleep(2000);
				//������ʡ��۰�̨��Ʊ
				driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[2]/ul/li[2]/a")).click();
				Thread.sleep(2000);
	
	*/	

		
		
		
	}

}