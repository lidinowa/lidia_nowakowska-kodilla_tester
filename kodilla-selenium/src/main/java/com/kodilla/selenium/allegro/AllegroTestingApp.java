package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.get("https://allegro.pl");

        //selektory Xpath:
//        WebElement categoryCombo = driver.findElement(By.xpath("//*[contains(@class, \"mr3m_1 m7er_k4 mj6k_n7 sy40i msts_pt mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4\")]"));
//        WebElement cookiesAccept = driver.findElement(By.xpath("//*[@class=\"myre_8v_x m7f5_6m_x _158e2_3u7X3\"]//button[1]"));
//        WebElement inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]//input[1]"));
//        WebElement searchButton = driver.findElement(By.xpath("//*[@type=\"submit\" and @data-role=\"search-button\"]"));

        //selektory CSS:

        WebElement cookiesAccept = driver.findElement(By.cssSelector("button[class*='mgn2'][data-role=accept-consent]"));
        WebElement categoryCombo = driver.findElement(By.cssSelector("[class*='mr3m'][data-role=filters-dropdown-toggle]"));
        WebElement inputField = driver.findElement(By.cssSelector("[class*='mr3m'][data-role=search-input]"));
        WebElement searchButton = driver.findElement(By.cssSelector("[class*='mgn2'][data-role=search-button]"));


        cookiesAccept.click();
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Elektronika"); //By value?
        inputField.sendKeys("Mavic mini");
        searchButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article:first-of-type")));

        List<WebElement> resultList = driver.findElements(By.cssSelector("section>article"));
        for (WebElement product: resultList){
            System.out.println(product.getText());
        }
    }
}