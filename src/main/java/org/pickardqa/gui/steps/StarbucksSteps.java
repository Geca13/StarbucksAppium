package org.pickardqa.gui.steps;

import org.pickardqa.gui.base.GuiBase;
import org.pickardqa.gui.helpers.urls.Url;
import org.pickardqa.gui.pages.Starbucks;

public class StarbucksSteps extends GuiBase {

    Starbucks star = new Starbucks();

    Url url = new Url();

    public void openStarbucksHomePage(){
        this.navigateTo(url.starbucks);
    }

    public void isAtMobilePage(){
        this.isVisible(star.getHamburgerMenu(), 10);
    }

    public void clickOrderMobile(){
        this.clickElement(star.getOrderMobile());
    }

    public void clickHamburger(){
        this.clickElement(star.getHamburgerMenu());
    }

    public void clickHotCoffee(){
        this.clickElement(star.getHotDrinks());
    }

    public void clickAllProducts(){ this.clickElement(star.getAllProducts());}

    public void clickAgreeBtn() { this.clickElement(star.getAgreeBtn()); }
}
