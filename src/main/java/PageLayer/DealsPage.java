package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class DealsPage extends BaseClass{
	
	@FindBy(name="title")
	private WebElement title;
	
	@FindBy(xpath="//a[@href='/deals']")
	private WebElement dealsLink;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveBTN;
	
	@FindBy(xpath="//a[@href='/deals/new']")
	private WebElement createBTN;
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDeals() throws InterruptedException {
		UtilsClass.click(dealsLink);
		Thread.sleep(5000);
		UtilsClass.click(createBTN);
	}
	
	public void enterTitle(String Title) {
		UtilsClass.sendKeys(title, Title);
	}
	public void clickSave() {
		UtilsClass.click(saveBTN);
	}

}
