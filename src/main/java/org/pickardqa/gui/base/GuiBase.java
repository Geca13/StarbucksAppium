package org.pickardqa.gui.base;
import com.codeborne.selenide.*;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GuiBase {

    public void navigateTo(String url){
        open(url);
    }

    public Boolean isEnabled(SelenideElement element){
        return element.isEnabled();
    }

    public Boolean isVisible(SelenideElement element, Integer seconds){
         element.shouldBe(visible, Duration.ofSeconds(seconds));
         if(element.exists()){
             return true;
         }else{
             return false;
         }
    }

    public String getElementText(SelenideElement element){
        return element.getText();
    }

    public void clickElement(SelenideElement element){
        element.click();
    }

    public void clearInput(SelenideElement element){
        element.clear();
    }

    public void type(SelenideElement element, String keys){
        element.sendKeys(keys);
    }

    public String getPlaceholderValue(SelenideElement element){
        return element.getAttribute("placeholder");
    }

    public String getColorValue(SelenideElement element){
        return element.getAttribute("color");
    }

    public String getBackgroundValue(SelenideElement element){
        return element.getAttribute("background");
    }

    public String getInputValue(SelenideElement element){
        return element.getAttribute("value");
    }

    public String getElementType(SelenideElement element){
        return element.getAttribute("type");
    }

    public void clearAllEnabledInputFields(List<SelenideElement> elements){
        for (SelenideElement el : elements) {
            if(el.isEnabled()){
                this.clearInput(el);
            }
        }
    }

    public void scroll300(SelenideElement element){
       actions().scrollByAmount(0, 300).build().perform();
    }



}
