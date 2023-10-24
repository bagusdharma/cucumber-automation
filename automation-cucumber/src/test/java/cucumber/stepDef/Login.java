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

public class Login {

    WebDriver driver;

    String baseUrl = "http://www.saucedemo.com/";

    @Given("user is on Sauce Demo login page")
    public void user_is_on_SauceDemo_login_page() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions opt = new FirefoxOptions();
        opt.setHeadless(false);

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("user input (.*) as username$")
    public void user_input_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("user input (.*) as password$")
    public void user_input_password(String password) {
//        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @Then("user click submit")
    public void user_click_submit() {
        driver.findElement(By.id("login-button")).click();
    }

}

