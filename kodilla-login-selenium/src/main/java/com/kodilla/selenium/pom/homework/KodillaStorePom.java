package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractKodillaStorePom {

    @FindBy(xpath = "//*[@name=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@class=\"element\"]")
    WebElement numberResultProducts;

    @FindBy(xpath = "//*[@class=\"element\"]//h3[contains(text(), 'School')]")
    WebElement numberResultProducts2;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int searchForProducts(String productName){
        search.sendKeys(productName);
      // List<WebElement> resultList = driver.findElements(By.xpath(numberResultProducts));
        List<WebElement> resultList = driver.findElements(By.xpath("//*[@class=\"element\"]"));
        return resultList.size();
    }
}