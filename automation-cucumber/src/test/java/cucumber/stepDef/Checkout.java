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

public class Checkout {

    WebDriver driver;

    String baseUrl = "http://www.saucedemo.com/";

    @Given("user login with valid credentials cart checkout")
    public void user_login_with_valid_credentials_cart_checkout() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions opt = new FirefoxOptions();
        opt.setHeadless(false);

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("user input (.*) as username cart item checkout$")
    public void user_input_username_cart_item_checkout(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("user input (.*) as password cart item checkout$")
    public void user_input_password_cart_item_checkout(String password) {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user click submit button cart checkout")
    public void user_click_submit_button_cart_checkout() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("user click add product to cart item checkout")
    public void user_click_add_product_to_cart_item_checkout() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("user click cart icon checkout")
    public void user_click_cart_icon_checkout() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @And("user click checkout")
    public void user_click_checkout() {
        driver.findElement(By.id("checkout")).click();
    }

    @And("user input first name")
    public void user_input_first_name() {
        driver.findElement(By.id("first-name")).sendKeys("test");
    }

    @And("user input last name")
    public void user_input_last_name() {
        driver.findElement(By.id("last-name")).sendKeys("test");
    }

    @And("user input postal code")
    public void user_input_postal_code() {
        driver.findElement(By.id("postal-code")).sendKeys("12345");
    }

    @And("user click continue checkout")
    public void user_click_continue_checkout() {
        driver.findElement(By.id("continue")).click();
    }

    @Then("user click finish")
    public void user_click_finish() {
        driver.findElement(By.id("finish")).click();
    }
}
