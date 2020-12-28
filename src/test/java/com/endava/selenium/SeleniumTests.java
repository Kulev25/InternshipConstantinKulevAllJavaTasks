package com.endava.selenium;

import com.endava.selenium.page.CompareAddToCartPage;
import com.endava.selenium.page.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SeleniumTests {

    WebDriver driver;

    @BeforeAll
    public static void webDriverSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bomba.md/");
    }

    @Test
    public void testLoginPageFactory() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("sexew61586@tjuln.com", "selenium123");
        assertThat(loginPage.getLoginValidationValue().equals("con"), is(true));
    }

    @Test
    public void testCompareAddToShoppingCartFactory() {
        CompareAddToCartPage compareAdd = new CompareAddToCartPage(driver);
        compareAdd.compareAddToCart();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
