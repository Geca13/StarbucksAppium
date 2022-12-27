package org.pickardqa.gui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Starbucks {

    private SelenideElement order = $(By.xpath("//a[@href='/menu']"));

    private SelenideElement allProducts = $(By.xpath("(//a[@href='/menu'])[2]"));

    private SelenideElement cards = $(By.xpath("//a[@href='/account/cards']"));

    private SelenideElement hamburgerMenu = $(By.xpath("//button[@aria-label='Open menu']"));

    private SelenideElement orderMobile = $(By.id("hamburger-nav-push-view-btn-Order-right"));


    private SelenideElement agreeBtn = $(By.id("truste-consent-button"));

    private SelenideElement add = $(By.xpath("//*[text()='Add Starbucks to Home screen']"));

    private SelenideElement hotDrinks = $(By.xpath("(//a[@href='/menu/drinks/hot-coffees'])[2]"));


    public SelenideElement getAllProducts() {
        return allProducts;
    }

    public SelenideElement getHamburgerMenu() {
        return hamburgerMenu;
    }

    public SelenideElement getOrderMobile() {
        return orderMobile;
    }

    public SelenideElement getHotDrinks() {
        return hotDrinks;
    }

    public SelenideElement getAgreeBtn() {
        return agreeBtn;
    }
}
