package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTest {

    KodillaStorePom kodillaStorePom;

    WebDriver driver;

//    @BeforeEach
//    public void setup() {
//        driver = new ChromeDriver();
//        driver.navigate().to("https://kodilla.com/pl/test/store");
//        kodillaStorePom = new KodillaStorePom(driver);
//    }

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/store");

    }

    @ParameterizedTest
    @ValueSource(strings = {"Gaming", "School", "Brand"})  //
    public void checkFindingOneResult(String value){
        assertEquals(1,kodillaStorePom.searchForProducts(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Notebook"})  //
    public void checkFindingThreeResults(String value){
        assertEquals(2,kodillaStorePom.searchForProducts(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Business", "Powerful"})  //
    public void checkFindingZeroResults(String value){
        assertEquals(0,kodillaStorePom.searchForProducts(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"School", "school", "SCHOOL"})  //
    public void checkFindingResultForLoweUpperCases(String value){
        assertEquals(1,kodillaStorePom.searchForProducts(value));
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}