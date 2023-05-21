package com.kodilla.selenium.allegro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class AllegroTestingAppTest {

    WebDriver driver;
    AllegroTestingApp allegroTestingApp;

    @Test
    public void testAllegroWithCssSelectors() {
        driver.get("https://allegro.pl");
        allegroTestingApp.checkAllegroWithCssSelectors();
        assertNotNull(allegroTestingApp.checkAllegroWithCssSelectors());
    }

    @Test
    public void testAllegroWithXpathSelectors() {
        driver.get("https://allegro.pl");
        allegroTestingApp.checkAllegroWithXpathSelectors();
        assertNotNull(allegroTestingApp.checkAllegroWithXpathSelectors());
    }

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }
}