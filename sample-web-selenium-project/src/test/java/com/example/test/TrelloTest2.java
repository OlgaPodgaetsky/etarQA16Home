package com.example.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TrelloTest2 {
  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testTrelloTest2() {
    openSite();
    typeName();
    typeEmail();
    typePassword();
    clickOnSignUpButton();
  }

  public void clickOnSignUpButton() {
    driver.findElement(By.id("signup")).click();
  }

  public void typePassword() {
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("1111111111");
  }

  public void typeEmail() {
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("etarnovskaya+6@gmail.com");
  }

  public void typeName() {
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("Elena");
  }

  public void openSite() {
    driver.get("https://trello.com/signup");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    driver.quit();
     }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

}
