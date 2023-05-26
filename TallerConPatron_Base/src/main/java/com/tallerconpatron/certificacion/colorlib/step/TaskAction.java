package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaFormulario;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaMenu;
import net.thucydides.core.annotations.Step;

public class TaskAction extends BasePage {

    private PaginaLogin paginaLogin;
    private PaginaMenu paginaMenu;

    private PaginaFormulario paginaFormulario;

    @Step
    public void openPage(){
        openApp();
    }

    @Step
    public void signIn(String strUser,String strPassword){
        sendKeyUser(strUser);
        sendKeysPassword(strPassword);
        paginaLogin.btnSingIn.click();
    }

    public void sendKeyUser(String strUser){
        paginaLogin.user.click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);
    }

    public void sendKeysPassword(String strPassword){
        paginaLogin.password.click();
        paginaLogin.password.clear();
        paginaLogin.password.sendKeys(strPassword);
    }

    @Step
    public void EntrarFormulario(){

        paginaMenu.button1.waitUntilClickable().click();
        paginaMenu.validationBtn.waitUntilClickable().click();

    }

    @Step
    public String checkTitleForm(){
        return paginaFormulario.getDriver().getTitle();
    }

    @Step
    public void fillAllFields(String required,String select,String multipleSel, String url,String email, String password, String confirmPass,String minfield, String maxField,String number, String ip, String date, String past){
        fillRequired(required);
        fillSelect(select);
        fillMultiSelect(multipleSel);
        fillUrl(url);
        fillEmail(email);
        fillPass(password);
        fillConfirmPass(confirmPass);
        fillMinField(minfield);
        fillMaxField(maxField);
        fillNum(number);
        fillip(ip);
        fillDate(date);
        fillpast(past);
    }

    public void fillRequired(String required){
        paginaFormulario.required.click();
        paginaFormulario.required.clear();
        paginaFormulario.required.sendKeys(required);
    }

    public void fillSelect(String sel){
        paginaFormulario.select.selectByValue(sel);
    }

    public void fillMultiSelect(String seld){
        paginaFormulario.multipleSelect.selectByValue(seld);
    }

    public void fillUrl(String url){
        paginaFormulario.url.click();
        paginaFormulario.url.clear();
        paginaFormulario.url.sendKeys(url);
    }

    public void fillEmail(String email){
        paginaFormulario.email.click();
        paginaFormulario.email.clear();
        paginaFormulario.email.sendKeys(email);
    }

    public void fillPass(String pass){
        paginaFormulario.password.click();
        paginaFormulario.password.clear();
        paginaFormulario.password.sendKeys(pass);
    }

    public void fillConfirmPass(String confirmPass){
        paginaFormulario.comfirmPass.click();
        paginaFormulario.comfirmPass.clear();
        paginaFormulario.comfirmPass.sendKeys(confirmPass);
    }

    public void fillMinField(String min){
        paginaFormulario.minsize.click();
        paginaFormulario.minsize.clear();
        paginaFormulario.minsize.sendKeys(min);
    }

    public void fillMaxField(String max){
        paginaFormulario.maxsize.click();
        paginaFormulario.maxsize.clear();
        paginaFormulario.maxsize.sendKeys(max);
    }

    public void fillNum(String num){
        paginaFormulario.number.click();
        paginaFormulario.number.clear();
        paginaFormulario.number.sendKeys(num);
    }

    public void fillip(String ip){
        paginaFormulario.ip.click();
        paginaFormulario.ip.clear();
        paginaFormulario.ip.sendKeys(ip);
    }

    public void fillDate(String date){
        paginaFormulario.date3.click();
        paginaFormulario.date3.clear();
        paginaFormulario.date3.sendKeys(date);
    }

    public void fillpast(String max){
        paginaFormulario.past.click();
        paginaFormulario.past.clear();
        paginaFormulario.past.sendKeys(max);
    }

    @Step
    public void clickValidate(){
        paginaFormulario.btnValidate.waitUntilClickable().click();
    }

    @Step
    public boolean checkFieldRequired(){
        return paginaFormulario.required.getText().equals("");
    }
}
