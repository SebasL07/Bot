package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/form-validation.html")
public class PaginaFormulario extends PageObject {

    @FindBy(xpath = "(//input[@class='validate[required] form-control'])[1]")
    public WebElementFacade required;

    @FindBy(xpath = "(//select[@name='sport'])[1]")
    public WebElementFacade select;

    @FindBy(xpath = "(//select[@name='sport2'])[1]")
    public WebElementFacade multipleSelect;

    @FindBy(xpath = "(//input[@class='validate[required,custom[url]] form-control'])[1]")
    public WebElementFacade url;

    @FindBy(xpath = "(//input[@name='email1'])[1]")
    public WebElementFacade email;

    @FindBy(xpath = "(//input[@name='pass1'])[1]")
    public WebElementFacade password;

    @FindBy(xpath = "(//input[@name='pass2'])[1]")
    public WebElementFacade comfirmPass;

    @FindBy(xpath = "(//input[@name='minsize1'])[1]")
    public WebElementFacade minsize;

    @FindBy(xpath = "(//input[@name='maxsize1'])[1]")
    public WebElementFacade maxsize;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElementFacade btnValidate;

    @FindBy(xpath = "(//input[@name='numbe2r'])[1]")
    public WebElementFacade number;

    @FindBy(xpath = "(//input[@name='ip'])[1]")
    public WebElementFacade ip;

    @FindBy(xpath = "(//input[@name='date3'])[1]")
    public WebElementFacade date3;

    @FindBy(xpath = "(//input[@name='past'])[1]")
    public WebElementFacade past;



}
