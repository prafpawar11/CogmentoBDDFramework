package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class ContactPage extends BaseClass{

	@FindBy(xpath="//a[@class='item active' or  @href ='/contacts']")
	private WebElement conatctLink;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createbtn;

	@FindBy(name="first_name")
	private WebElement fname;

	@FindBy(name="last_name")
	private WebElement lname;

	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebtn;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnContactLink()
	{
		UtilsClass.click(conatctLink);
		
	}

	public void clickOnCreateBtn()
	{
		UtilsClass.click(createbtn);
		
	}
	
	public void CreateUserFunctionality(String fname1, String lname1)
{
	UtilsClass.sendKeys(fname, fname1);
	UtilsClass.sendKeys(lname, lname1);
}
	public void clickOnSave()
	{
		UtilsClass.click(savebtn);
	
}

}
