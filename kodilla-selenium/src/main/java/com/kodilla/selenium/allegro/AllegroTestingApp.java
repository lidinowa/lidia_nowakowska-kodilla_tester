package com.kodilla.selenium.allegro;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllegroTestingApp {

    WebDriver driver;

    WebDriverWait wait = new WebDriverWait(driver, 20);

    // selektory Xpath:
    WebElement categoryComboXpath = driver.findElement(By.xpath("//*[contains(@class, \"mr3m_1 m7er_k4 mj6k_n7 sy40i msts_pt mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4\")]"));
    WebElement cookiesAcceptXpath = driver.findElement(By.xpath("//*[@class=\"myre_8v_x m7f5_6m_x _158e2_3u7X3\"]//button[1]"));
    WebElement inputFieldXpath = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]//input[1]"));
    WebElement searchButtonXpath = driver.findElement(By.xpath("//*[@type=\"submit\" and @data-role=\"search-button\"]"));

    //selektory CSS:

    WebElement cookiesAcceptCSS = driver.findElement(By.cssSelector("button[class*='mgn2'][data-role=accept-consent]"));
    WebElement categoryComboCSS = driver.findElement(By.cssSelector("[class*='mr3m'][data-role=filters-dropdown-toggle]"));
    WebElement inputFieldCSS = driver.findElement(By.cssSelector("[class*='mr3m'][data-role=search-input]"));
    WebElement searchButtonCSS = driver.findElement(By.cssSelector("[class*='mgn2'][data-role=search-button]"));


    public List<WebElement> checkAllegroWithCssSelectors() {
        cookiesAcceptCSS.click();
        Select categorySelect = new Select(categoryComboCSS);
        categorySelect.selectByVisibleText("Elektronika");
        inputFieldCSS.sendKeys("Mavic mini");
        searchButtonCSS.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article:first-of-type")));

        List<WebElement> resultList = driver.findElements(By.cssSelector("section>article"));
//        for (WebElement product : resultList) {
//            System.out.println(product.getText());
        return resultList;
    }


    public List<WebElement> checkAllegroWithXpathSelectors() {
        cookiesAcceptXpath.click();
        Select categorySelect = new Select(categoryComboXpath);
        categorySelect.selectByVisibleText("Elektronika");
        inputFieldXpath.sendKeys("Mavic mini");
        searchButtonXpath.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article:first-of-type")));

        List<WebElement> resultList = driver.findElements(By.cssSelector("section>article"));
//        for (WebElement product : resultList) {
//            System.out.println(product.getText());
        return resultList;
    }
}

