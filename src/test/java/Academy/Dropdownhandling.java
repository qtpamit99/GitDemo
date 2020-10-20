package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit\\Desktop\\ude selenium java\\software\\chromedriver.exe");
		 
		// **Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318461158245%7Ce%7Cwww%20facebook%20com%27%7C&placement=&creative=318461158245&keyword=www%20facebook%20com%27&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387723%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-371743446902%26loc_physical_ms%3D9299051%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI1-3XpJ-16wIViX4rCh3lQgzEEAAYASAAEgLYdPD_BwE");
		
		//
		WebElement day= driver.findElement(By.id("day"));
		//
		WebElement month= driver.findElement(By.id("month"));
		
	    //
		WebElement year= driver.findElement(By.id("year"));
		//crate object for select class bcz it class ablable in the select 
		 /*	Select select=new Select (day);
		//selecting specfic day 
		select.selectByVisibleText("10");
		//
		Select select1=new Select (month);
		select1.selectByVisibleText("May");
		Select select2=new Select (year);
		select2.selectByVisibleText("1990");*/
		
	//*** It's a repatble task for selecting different different value 
		//**avoiading this issue below we utlity (genric method )method and we have to just pass value 
		      //**selectvaluefromDropdown(day, "10");  // calling for day 
		    //***selectvaluefromDropdown(month, "May"); // calling for month
		    //***selectvaluefromDropdown(year, "1990");  //calling for day 
		
		//but i have to enter below value 
		String dob ="10-May-1990";
		//spliting 
		String donArr[] =dob.split("-");
		selectvaluefromDropdown(day, donArr[0]);
		selectvaluefromDropdown(month, donArr[1]);
		selectvaluefromDropdown(year, donArr[2]);
	
	}
	public static void selectvaluefromDropdown (WebElement element , String value) {
		Select select=new Select (element);
		select.selectByVisibleText(value);
		
	
	}

}
