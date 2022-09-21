package com.orangeHRM.tests;

import com.orangeHRM.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {
    @Test(enabled = false)
    public void verifyLogo(){
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.validateLogo();
        boolean flag=loginPage.validateLogo();
        Assert.assertTrue(flag);
    }
    @Test
    public void verifyLogin(){
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login();
        String actualUrl=driver.getCurrentUrl();
        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        Assert.assertEquals(actualUrl, expectedURL);

    }

}
