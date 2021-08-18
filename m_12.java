package Maven_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Assignment:Performing addition,Subtraction,Multiplication,Division by using Selenium with Maven Framework.

public class m_12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	// Launching ChromeDriver Version by using ChromeDriver Dependencies by Pom.xml File
		WebDriverManager.chromedriver().browserPath(" 91.0.4472.124").setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//To open website of calculator
		   driver.get("https://www.calculator.net/");
		   driver.findElement(By.xpath("//div[@id='sciOutPut']")).click();
		   
		   // TC01: For Multiplication of N1 & N2
		   
		   
		   //Enter N1 =423
		   
		   driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                   // to click  4
		   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                   // to click  2
		   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                   // to click  3
		   
		   driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();                   //to click Multiplication sign
		 
		   //Enter N2= 525
		   
		   driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();                   // to click 5
		   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                   // to click 2
		   driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();                   // to click 5
		   
		   System.out.println("Multiplication of 423*525" +"=222075");
		   Thread.sleep(2000);                                                                      // 2sec thread is applied
		   
		   driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();                   // to clear previous multiplication data
		                                                                           
		  // TC02: For Division of N1 & N2
		   
		 //  Enter N1= 4000
		   
		    driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                       //to click 4
		    driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();          // to click 0
		         driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();          // to click 0
		         driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();           // to click 0
		         
		         
		         driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();         // for Division operation
		       
		         //Enter N2 =200
		     
		         driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                     // to click  2
		         driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();        // to click 0
		         driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();        // to click 0
		         
		         System.out.println("Division of 4000/200" +"=20");
		         Thread.sleep(2000);
		         driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();                       // to clear previous Division  data
		     
		         
		         //TC03: For addition of N1 & N2
		       
		         //Enter N1 = -234234
		         
		         driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();                     //to click - sign
		         driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                     // to click  2
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                     // to click  3
		         driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                     // to click 4
		         driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                     // to click  2
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                     // to click  3
		         driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                     // to click 4
		         
		         driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();        //to click add sign
		         
		         //Enter N2= 345345
		         
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                     // to click  3
		         driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                     // to click 4
		         driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();                     // to click 5
		         
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                     // to click  3
		         driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                     // to click 4
		         driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();                      // to click 5
		         
		         System.out.println("Addition of -234234+345345"   + "=111111");
		         Thread.sleep(2000);
		         driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();                // to clear previous addition data
		         
		         
		         
		         //TC04: for Subraction of N1 & N2
		         
		         //Enter N1= 234823
		         
		         driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                     // to click  2
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                     // to click  3
		         driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                      // to click 4
		         driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();                      // to click 8
		         driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                     // to click  2
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                     // to click  3
		         
		         driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();                     //to click - sign
		         
		         //Enter N2= -23094823
		         
		         driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();                     //to click - sign
		         driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                      // to click  2
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                      // to click  3
		         driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();         // to click  0
		         driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();                      // to click  9
		         driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();                      // to click 4
		         driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();                      // to click 8
		       
		         driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();                     // to click  2
		         driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();                     // to click  3
		         
		         System.out.println("Subtraction of 234823 - 23094823"  +"=23329646");
		}

		

	}
