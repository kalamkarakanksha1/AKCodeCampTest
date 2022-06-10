package com.accesshq.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private final WebDriver driver;
    private WebElement webelement;

    public MenuPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickMenuTab() {
        driver.findElement(By.cssSelector("[aria-label='menu']")).click();
    }
    public void clickSidesTab() {
        driver.findElements(By.className("v-icon notranslate material-icons theme--light")).get(3).click();
//        for(var nameOfTab: nameOfTabs){
//            if(nameOfTab.getText().equalsIgnoreCase("Sides")){
//                nameOfTab.click();
//            }
//        }
    }
}
