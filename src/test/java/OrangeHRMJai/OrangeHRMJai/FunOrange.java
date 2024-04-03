package OrangeHRMJai.OrangeHRMJai;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunOrange {
	WebDriver dr;

	private By username=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	private By Password=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	private By Button=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	public FunOrange(WebDriver dr) {this.dr = dr;}


	public void login()
	{
		dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void Funct(String us,String pass)
	{
		dr.findElement(username).sendKeys(us);
		dr.findElement(Password).sendKeys(pass);
		dr.findElement(Button).click();
		
	if(dr.getPageSource().contains("Dashboard")) 
		System.out.println(us+" and "+pass+" is valid credientail");
	else                                        
		System.out.println(us+" and "+pass+" is Invalid credientail");
	dr.close();
	}

}
