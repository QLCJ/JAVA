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
		   //��һ����
		    @Test
		    public  void demo1() throws InterruptedException {
		    //��ȥ�Ķ�����ҳ
		    driver.get("https://www.qunar.com/");
			 Thread.sleep(3000);
		    //��������/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/input
		    driver.findElement(By.name("fromCity")).sendKeys("�Ͼ�(NKG)");
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[3]")).click();
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[1]/div[3]")).click();
		    //�������
		    driver.findElement(By.name("toCity")).sendKeys("����(BJS)");
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/div[3]")).click();
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/div[3]")).click();
		    //��������
		 	driver.findElement(By.id("js_domestic_fromdate")).sendKeys(Keys.CONTROL, "a");  
		 	driver.findElement(By.id("js_domestic_fromdate")).sendKeys("2018-06-01");	
		     //��ѯ
		 	driver.findElement(By.className("button-search")).click();
		 	 Thread.sleep(3000);
		 	 //ѡ��ֱ��
		     driver.findElement(By.className("lab")).click();	  
		 	//�ڶ�����
		     //����
		 	driver.navigate().back(); 
		 	 //�����Ʊ
		 	 driver.findElement(By.id("__link_flight__")).click();
		 	 //ѡ������
		 	 driver.findElement(By.id("searchTypeRnd")).click();
		 	 //��������
		 	 driver.findElement(By.id("toDate")).sendKeys(Keys.CONTROL, "a");  
		 	 driver.findElement(By.id("toDate")).sendKeys("2018-06-05");
			 //��ѯ
		 	 driver.findElement(By.className("btn_search")).click();
		 	 Thread.sleep(3000);	
		 	//��������
		 	 //����
		 	driver.navigate().back(); 	 
		 	 //ѡ��۰�̨��Ʊ
		 	 driver.findElement(By.id("js_inter_tab")).click();
			 Thread.sleep(1000);
			 //��������
		     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).sendKeys("�Ͼ�(NKG)");	
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[1]/div/input")).click();
		 	 // �ﵽ����
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).sendKeys("��ɼ�(LAX)");			
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();	
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[2]/div/input")).click();
			 //��������
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys(Keys.CONTROL, "a");  
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).sendKeys("2018-06-10");
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[1]/div/input")).click();
			 Thread.sleep(1000);
			 //�س�����
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2018-06-15");
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
			 Thread.sleep(1000);
			 //��ѯ
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		 	 Thread.sleep(3000);
		 	//���Ĳ���
		 	 //����
		 	driver.navigate().back(); 
		 	//�ı�س�����
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
		     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys(Keys.CONTROL, "a");  
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).sendKeys("2018-06-20");
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[2]/div[3]/div/input")).click();
			//���ó�������
		 	 driver.findElement(By.name("adultNum")).click();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[1]/div[2]/ul/li[2]")).click();
		 	 //���ö�ͯ����
		 	 driver.findElement(By.name("childNum")).click();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[2]/div[1]/div[3]/div[2]/div[2]/ul/li[2]")).click();
		 	 //��ѯ
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		 	 //��װһ��������ѯҳ��Ԫ�صķ������ж��Ƿ����ֱ�ɺ��࣬�ڿ���̨��ӡ���
		 //	 Judge p=new Judge();
		 //	 if( p.isContentAppeared(driver, "ֱ��")) System.out.print("�к���ֱ��");
		//	 else System.out.print("�޺���ֱ��");
		 	//���岿��
		 	 //����
		 	 driver.navigate().back(); 
			 //ѡ����
			 driver.findElement(By.id("searchTypeMulti")).click();
			 //��������
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("�Ͼ�");
		 	 Thread.sleep(1000);
		 	 //��������
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).sendKeys("2018-06-20");
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[1]/div[2]/div/input")).click();
		 	 Thread.sleep(1000);
		 	 //�س�ʱ��������
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("��ɼ�(LAX)");
		 	// Thread.sleep(1000);
		 	 //�س�ʱ�������
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[1]/div[3]/div/input")).sendKeys("�Ϻ�(SH)");
		 	 Thread.sleep(1000);
		 	 //�س�ʱ��������
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).clear();
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).sendKeys("2018-06-30");
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[3]/div[1]/div[2]/div[2]/div/input")).click();
		 	 Thread.sleep(1000);
		 	 //��ѯ
		 	 driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/form/div[6]/button")).click();
		 	 Thread.sleep(5000);
		 	 //��������
		 	  //��һ��ѡ���һ������
			 driver.manage().window().maximize(); 
		 	 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/a/span/b")).click();  
				 Thread.sleep(5000);
		 	 //�ڶ���ѡ�񶫷����յ� 
		 	 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div/div[1]")).click();
		 	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,200)"); 
		 	 Thread.sleep(5000);
		    driver.findElement(By.cssSelector("input[value=MU]")).click();
			 Thread.sleep(5000);
		  //���߲���
		 	  //ѡ���һ������
			 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[5]/div[2]/div[2]/div[4]/div[1]/div/div[7]/div/a/span/b")).click();
			 Thread.sleep(5000);
			 //Ԥ��
			 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[4]/div[2]/div[4]/div/div[2]/div/div[6]/div[3]/div/div/div[1]/a")).click();
		    }
		
		}
	    

