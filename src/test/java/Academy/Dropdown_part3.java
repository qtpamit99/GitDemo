package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_part3 {
	static WebDriver driver;


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit\\Desktop\\ude selenium java\\software\\chromedriver.exe");
		 
		// **Initialize browser
		driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318461158245%7Ce%7Cwww%20facebook%20com%27%7C&placement=&creative=318461158245&keyword=www%20facebook%20com%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387723%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-371743446902%26loc_physical_ms%3D9299051%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI1-3XpJ-16wIViX4rCh3lQgzEEAAYASAAEgLYdPD_BwE");

		//without using select class select dropdown value
		String month_xpath= "//select[@id='month']//option";
		String day_xpath= "//select[@id='day']//option";
		String year_xpath= "//select[@id='year']//option";
		
		
		selectdropdownvalue(month_xpath,"May");
		selectdropdownvalue(day_xpath,"18");
		selectdropdownvalue(year_xpath,"1995");
	

	} 
	public static void selectdropdownvalue(String xpathvalue,String value) {
		List <WebElement> montlist=	driver.findElements(By.xpath(xpathvalue));
		System.out.println(montlist.size()-1);
		//printing all the value 
		for (int i=0;i<montlist.size();i++) {
			System.out.println(montlist.get(i).getText());
			//select specfic month
			if (montlist.get(i).getText().equals(value)) {
			montlist.get(i).click();
			break;
		
			}

			
		} 
		
	}

}
