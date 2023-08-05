package Steps;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DealsPageTest extends BaseClass {

	private static DealsPage dealsPage;

	@Given("User click on deals link")
	public void user_click_on_deals_link() throws InterruptedException {
		dealsPage = new DealsPage();
		dealsPage.clickOnDeals();

	}

	@Then("user enters title")
	public void user_enters_title() {
		dealsPage.enterTitle("Automation");
	}

	@Then("click on Deals save button")
	public void click_on_deals_save_button() {
		dealsPage.clickSave();
	}

}
