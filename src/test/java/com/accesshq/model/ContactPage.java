package com.accesshq.model;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {

    private final WebDriver driver;

    public ContactPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnContactTab() {
        driver.findElement(By.cssSelector("[aria-label='contact']")).click();
    }

    public void verifySubmitButton() throws InterruptedException {
        driver.findElement(By.id("forename")).sendKeys("Dan");
        driver.findElement(By.id("email")).sendKeys("dan@abc.com");
        driver.findElement(By.id("message")).sendKeys("Nice pizza");
        driver.findElement(By.cssSelector("[aria-label='submit']")).click();
        Thread.sleep(5000);
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.className("v-alert__content"))));
        var result =  driver.findElement(By.className("v-alert__content")).getText().toString();
        System.out.println("REsult---"+result);
        Assertions.assertEquals("Thanks Dan, we appreciate your feedback",result);

    }
}
