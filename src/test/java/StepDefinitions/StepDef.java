package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDef {
    WebDriver driver;
    WebElement checkbox;
    @Given("I launch browser")
    public void i_launch_browser() {
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\rabba\\Softwares\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    @When("I open webpage")
    public void i_open_webpage() {
        driver.get("https://demo.guru99.com/test/radio.html");
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
    @Then("I select checkbox")
    public void i_select_checkbox() {
        //Clicking Checkbox button
        checkbox = driver.findElement(By.id("vfb-6-0"));
        checkbox.click();
    }
    @Then("I verify checkbox is selected or not")
    public void i_verify_checkbox_is_selected_or_not() {
        if (checkbox.isSelected())
            System.out.println("checkbox is selected");
        else
            System.out.println("checkbox is not selected");
    }
}
