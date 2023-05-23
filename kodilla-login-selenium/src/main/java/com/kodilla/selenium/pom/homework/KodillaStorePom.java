package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom {

    @FindBy(xpath = "//*[@name=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@class=\"element\"]")
    List<WebElement> numberResultProducts; //driver finds elemnts By....

    @FindBy(xpath = "//*[@class=\"element\"]//h3[contains(text(), 'School')]")
    WebElement numberResultProducts2;


    public int searchForProducts(String productName){
        search.sendKeys(productName);
        List<WebElement> resultList = numberResultProducts;
        return resultList.size();
    }
}