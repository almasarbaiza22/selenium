package stepsPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.util.TestBase;

public class HomepagePages extends TestBase{
	
	@FindBy(id="//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input") 
	WebElement SearchBox;
	
	//Initializing the Page Objects
	public HomepagePages() {
	PageFactory.initElements(driver, this);
	
}
	//Actions:
	
   
 
 
  }
 

 	    


