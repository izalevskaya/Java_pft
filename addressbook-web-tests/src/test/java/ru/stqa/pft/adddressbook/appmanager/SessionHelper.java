package ru.stqa.pft.adddressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver driver) {
    super(driver);
  }

  public void login(String username, String password) {
    type(By.name("user"), username);
    click(By.id("LoginForm"));
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }
}
