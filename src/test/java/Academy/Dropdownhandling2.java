package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit\\Desktop\\ude selenium java\\software\\chromedriver.exe");
		 
		// **Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318461158245%7Ce%7Cwww%20facebook%20com%27%7C&placement=&creative=318461158245&keyword=www%20facebook%20com%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387723%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-371743446902%26loc_physical_ms%3D9299051%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI1-3XpJ-16wIViX4rCh3lQgzEEAAYASAAEgLYdPD_BwE");
		// find element for day
		WebElement day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		
		Select select=new Select(day);
		select.selectByIndex(10);
		System.out.println (select.isMultiple());
		
		//how many dropdown value are there 
		List <WebElement> listDays =select.getOptions();
		System.out.println(listDays.size()-1);
		//print all values \
		for (int i=1;i<listDays.size();i++) {
		String dayval=listDays.get(i).getText();
            System.out.println(dayval);
            
            //select specfic value from the dropdown 
            if (dayval.equals("20")) {
           listDays.get(i).click();
			break;
            }
		}
		

	}

}
