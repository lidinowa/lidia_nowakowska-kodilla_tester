package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        //selektory:
        WebElement categoryCombo = driver.findElement(By.xpath("//*[contains(@class, \"mr3m_1 m7er_k4 mj6k_n7 sy40i msts_pt mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4\")]"));
        WebElement cookiesAccept = driver.findElement(By.xpath("//*[@class=\"myre_8v_x m7f5_6m_x _158e2_3u7X3\"]//button[1]"));
        WebElement inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]//input[1]"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@type=\"submit\" and @data-role=\"search-button\"]"));

        cookiesAccept.click();
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Elektronika"); //By value?
        inputField.sendKeys("Mavic mini");
        searchButton.click();
    }
}