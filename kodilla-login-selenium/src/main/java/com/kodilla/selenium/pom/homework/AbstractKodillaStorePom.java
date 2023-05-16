package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public class AbstractKodillaStorePom {
    protected WebDriver driver;

    public AbstractKodillaStorePom(WebDriver driver) {
        this.driver = driver;
    }
}
