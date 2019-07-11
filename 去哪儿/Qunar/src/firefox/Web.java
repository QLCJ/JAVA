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
		driver = new FirefoxDriver();                //�򿪻��
		driver.navigate().to("https://www.qunar.com/");
		driver.manage().window().maximize();        //�Ŵ������
		
		//ת����ַ
		driver.get("https://www.qunar.com/");
	
//��һ����		
		//��������
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).sendKeys("�Ͼ�(NKG)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//Ŀ�ĵ�
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).sendKeys("����(BJS)");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/input")).click();
		Thread.sleep(2000);
		//����ʱ��
		//driver.findElement(By.name("fromDate")).click();
		driver.findElement(By.name("fromDate")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.name("fromDate")).sendKeys("2019-08-1");
		Thread.sleep(3000);
		//�������
		driver.findElement(By.className("button-search")).click();
		Thread.sleep(3000);
		//���ֱ��
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/div[5]/label/span")).click();
		Thread.sleep(3000);
			
//�ڶ�����	
		//�������
		driver.navigate().back();
		Thread.sleep(2000);
		//�����Ʊ
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[2]/a/span/b")).click();
		Thread.sleep(2000);
		//�������
		driver.findElement(By.xpath("//*[@id=\"js_lab_rng\"]")).click();
		Thread.sleep(2000);
		//���÷���ʱ��
		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys("2019-11-1");
		Thread.sleep(3000);
		//�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[1]/form/div[4]/button")).click();
		Thread.sleep(3000);
//��������
		//������һ��
		driver.navigate().back();
		Thread.sleep(2000);
		//����۰�̨
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//��������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).sendKeys("�Ͼ�(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		Thread.sleep(3000);
		//Ŀ�����
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("��ɼ�(LAX)");
		//driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("�ռ�(HKT)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//����ʱ�� 
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys("2019-11-01");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).click();
		Thread.sleep(3000);
		//����ʱ��                   
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-11-14");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(3000);
		//�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(3000);
		
//���Ĳ���
		//���ص���һ����
		driver.navigate().back();
		Thread.sleep(2000);
		//���ķ�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2019-11-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		Thread.sleep(3000);
		//��ӳ�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[2]/ul/li[2]")).click();
		Thread.sleep(3000);
		//��Ӷ�ͯ����
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[2]/ul/li[2]")).click();
		Thread.sleep(3000);
		//�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(2000);
		//�ж��Ƿ���ֱ�ɲ��ڿ���̨���
		try {
			driver.findElement(By.className("lab"));
			System.out.println("��ֱ�ﺽ��");
		}catch(Exception e) {
			System.out.println("��ֱ�ﺽ��");
		}	
		Thread.sleep(2000);
		
//���岿��                   
		//������һ�����
		driver.navigate().back();
		Thread.sleep(2000);
		//������
		driver.findElement(By.id("searchTypeMulti")).click();
		Thread.sleep(2000);
		//��һ�̳�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("�Ͼ�(NKG)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
		//Ŀ�ĵ�
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).sendKeys("��ɼ�(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[3]/div/input")).click();
		//��������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys("2019-11-09");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//�ڶ��̳�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("��ɼ�(LAX)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//Ŀ�ĳ���
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).sendKeys("�Ϻ�(SHA)");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
		Thread.sleep(3000);
		//����ʱ��
		//driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys("2019-11-15");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		Thread.sleep(3000);
		//�������
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		Thread.sleep(5000);
		
//��������
		//�����һ������� ѡ�� ��ť                                                  /html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b      
		driver.findElement(By.cssSelector("html body div#j-pagecontainer.q_pagecontainer div.q_pagewrap div.q_page div.l_lside div#list-box.m-cheng-dtl div.js-fl-box div#js-avt-lst.ch-bd div.m-avt-wrap.js-avt-wrap div.js-item div.m-avt.m-avt-v1 div.c6 div.a_booking a.btn.js-select-pr span b")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b")).click();
		Thread.sleep(3000);
		//����ʹ���չ�˾����ʾ������ȫ
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		//������๫˾  (�ڶ���Ҫ�󺽰๫˾)
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]")).click();
		Thread.sleep(3000);
		//ѡ��   ��������
		driver.findElement(By.xpath("//*[@class=\"list\"]/ul[position()>0 and position()<5]/li[position()>0 and position()<9]//*[text()='��������']")).click();
		Thread.sleep(3000);
		
//���߲���
		//���������Ϣ�ĵ�һ�������  ѡ��  ��ť
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[7]/div/a/span/b")).click();
		Thread.sleep(8000);
		//�����һ��ȫ�̺���� Ԥ�� ��ť
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[4]/div[2]/div[4]/div/div[2]/div/div[6]/div[3]/div/div/div[1]/a")).click();
		Thread.sleep(8000);
		
		
		//��ת��������ַ
		//driver.get("https://pangolin.flight.qunar.com/flightns/pangolin/booking?bk=fa7f1307d1104d05b29fb199168b9685%5E3e52990f7bff45058635df8295b99310&qt=9ed9ccc8388b02mA%5E9ed9ccc8388c02mA&bksource=&type=1");
		//Thread.sleep(8000);
		
		 
		//�л��������ǩ            �������� Keys ���Ƽ��̵�   CTRL+TAB    Ҳ�����л���ǩ
		Set<String>winHandels = driver.getWindowHandles();       //�õ���ǰ���ڵ�set����
		List<String> it = new ArrayList<String>(winHandels);     //��set���ϴ���list����
		driver.switchTo().window(it.get(1));                     //�л����������´���
	/*	String urll = driver.getCurrentUrl();                    //��ȡ��ǰҳ���url   
		driver.switchTo().window(it.get(0));                     //������ԭҳ��             �������費��Ҫ         */
		Thread.sleep(8000);
		
		
		//��ͼ
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(srcFile, new File("C:\\��Ļ��ͼ",".png"));
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
