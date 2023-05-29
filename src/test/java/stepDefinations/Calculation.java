package stepDefinations;


import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Calculation {
	

	 double GrossSalry;
	 double IncomeTax;
	 double PF;
	 double ProfessionalTax;
	 double NetSalary;
	
	@Given("^User Should Navigate to Calculation page$")
    public void User_Should_Navigate_to_Calculation_page() {
		
		 System.out.println("click on calculator");
        
    }
	@When("User Enter grossalary {string}")
	public void user_enter_grossalary(String grossSal) {
		
		this.GrossSalry=Double.parseDouble(grossSal);
	}
    @And("^User enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_something_and_something_and_something(String incometax, String pf, String professionaltax){
        
    	this.IncomeTax=Double.parseDouble(incometax);
 	   this.PF=Double.parseDouble(pf);
 	   this.ProfessionalTax=Double.parseDouble(professionaltax);
 	   this.NetSalary=this.GrossSalry-this.PF-this.IncomeTax-this.ProfessionalTax;
    }


    @Then("^User should get NetSalary information \"([^\"]*)\"$")
    public void user_should_get_netsalary_information_something(String netsalary) {
    	
    	System.out.println(this.NetSalary);
    	System.out.println(Double.parseDouble(netsalary));
    	Assert.assertTrue(this.NetSalary==Double.parseDouble(netsalary));
        
    }

   
}
