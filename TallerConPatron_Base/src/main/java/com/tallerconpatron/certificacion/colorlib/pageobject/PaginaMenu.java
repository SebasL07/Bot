package com.tallerconpatron.certificacion.colorlib.pageobject;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/index.html?")
public class PaginaMenu extends PageObject {

    @FindBy(xpath = "(//span[@class='fa arrow'])[3]")
    public WebElementFacade button1;


    @FindBy(xpath = "(//a[@href='form-validation.html'])[2]")
    public WebElementFacade validationBtn;


}
