package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Addcart {

    WebDriver driver;

    String baseUrl = "http://www.saucedemo.com/";

    @Given("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions opt = new FirefoxOptions();
        opt.setHeadless(false);

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("user input (.*) as username cart$")
    public void user_input_username_cart(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("user input (.*) as password cart$")
    public void user_input_password_cart(String password) {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user click submit button")
    public void user_click_submit_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user click add product to cart")
    public void user_click_add_product_to_cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
}
