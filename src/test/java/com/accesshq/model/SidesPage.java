package com.accesshq.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SidesPage {

    private WebElement webElement;
    private WebDriver driver;

    public SidesPage(WebElement webElement){
        this.webElement =webElement;
    }

    public SidesPage(WebDriver driver) {
        this.driver=driver;
    }

    public ArrayList<SidesCard> getAllSidesCard(){
        ArrayList<SidesCard> allCards = new ArrayList<SidesCard>();
        var listOfSidesCards = this.driver.findElements(By.className("flex mb-2 mt-5 xs12 sm6 md3 lg2"));
        for(var listOfSidesCard:listOfSidesCards){
            allCards.add(new SidesCard(listOfSidesCard));
        }
        return allCards;
    }

    public SidesCard getspecificCard(Predicate<SidesCard> criteria){
        for(SidesCard sidesCard:getAllSidesCard()){
            if(criteria.test(sidesCard)){
                driver.findElement(By.className("ribbon ribbon-top-left")).click();
            }
        }
        throw new NotFoundException("Card Not Found");
    }
}
