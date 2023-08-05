package Steps;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContactPageSteps extends BaseClass {

	
	private static ContactPage contactpage;

	@Given("user click on contact link")
	public void user_click_on_contact_link() {
		contactpage = new ContactPage();
		contactpage.clickOnContactLink();

	}

	@Then("user click on create create button")
	public void user_click_on_create_create_button() {
		contactpage.clickOnCreateBtn();
	}

	@Then("user enters Firstname Last")
	public void user_enters_firstname_last() {
		contactpage.CreateUserFunctionality("gauri", "chawathe");
	}

	@Then("click on save button")
	public void click_on_save_button() {
		contactpage.clickOnSave();
	}

}


