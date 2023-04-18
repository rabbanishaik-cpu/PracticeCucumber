package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginStepDef {
    WebDriver driver;
    @Given("I launch browser")
    public void i_launch_browser() {
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\rabba\\Softwares\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    @When("I open webpage")
    public void i_open_webpage() {
        driver.get("http://www.calculator.net/");
        driver.manage().window().maximize();
    }
    @Then("I verify tile name of the page")
    public void i_verify_tile_name_of_the_page() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
    }
    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
