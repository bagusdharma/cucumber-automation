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

public class Removecart {

    WebDriver driver;

    String baseUrl = "http://www.saucedemo.com/";

    @Given("user login with valid credentials cart")
    public void user_login_with_valid_credentials_cart() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions opt = new FirefoxOptions();
        opt.setHeadless(false);

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("user input (.*) as username cart item$")
    public void user_input_username_cart_item(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("user input (.*) as password cart item$")
    public void user_input_password_cart_item(String password) {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user click submit button cart")
    public void user_click_submit_button_cart() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("user click add product to cart item")
    public void user_click_add_product_to_cart_item() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("user click cart icon")
    public void user_click_cart_icon() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Then("user remove cart product")
    public void user_remove_cart_product() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }
}
