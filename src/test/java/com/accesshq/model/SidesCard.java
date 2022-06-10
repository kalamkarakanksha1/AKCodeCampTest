package com.accesshq.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class SidesCard extends ArrayList<SidesCard> {
    private final WebElement webElement;
    WebDriver driver;

    public SidesCard(WebElement webElement) {
        this.webElement=webElement;
    }

    public String getFlag(){
        return webElement.findElement(By.className("ribbon ribbon-top-left")).getText();
    }
    public String getName(){
        return webElement.findElement(By.className("name")).getText();
    }

}
