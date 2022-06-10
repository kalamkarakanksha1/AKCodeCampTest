package tests;

import com.accesshq.model.ContactPage;
import com.accesshq.model.MenuPage;
import com.accesshq.model.SidesCard;
import com.accesshq.model.SidesPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.Predicate;

public class TestSuites {
    WebDriver driver;
    @BeforeEach
    public void BeforeEachTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d3eczsrdruv8hn.cloudfront.net/#");
    }
    @Test
    public void TestContactPageSubmitButton() throws InterruptedException {
      new ContactPage(driver).clickOnContactTab();
      new ContactPage(driver).verifySubmitButton();
    }

    @Test
    public void CheckKoreanStickyWings(){
        new MenuPage(driver).clickMenuTab();
        new MenuPage(driver).clickSidesTab();
        new SidesPage(driver).getspecificCard(sidesCard -> sidesCard.getFlag().equalsIgnoreCase("New"));
    }

    @AfterEach
    public void AfterEachTest(){
      // driver.quit();
    }
}
