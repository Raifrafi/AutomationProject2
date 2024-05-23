package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class stepDefinationSingIn {

	
	@Given("User is on the SingIn page")
	public void user_is_on_the_sing_in_page() {
System.out.println("User is on the SingIn page");

	}

	@When("User given valid credention")
	public void user_given_valid_credention() {
		System.out.println("User given valid credention");
   
	    
	}

	@Then("Enter the singin button")
	public void enter_the_singin_button() {
	    
		System.out.println("Enter the singin button");
    
	}

	@Then("Singin page appear")
	public void singin_page_appear() {
		System.out.println("Singin page appear");
 
	   }

}
