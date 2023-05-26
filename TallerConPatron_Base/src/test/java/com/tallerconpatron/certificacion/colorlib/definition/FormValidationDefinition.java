package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.step.TaskAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class FormValidationDefinition extends BasePage {

    private String user;
    private String password;

    private String required;
    private String select;
    private String multipleSel;
    private String url;
    private String email;
    private String password2;
    private String confirmPass;
    private String minfield;
    private String maxField;
    private String number;
    private String ip;
    private String date;
    private String past;

    @Steps
    TaskAction taskAction;

    @Given("I enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }

    @When("I proceed with the authentication")
    public void iProceedWithTheAuthentication() {
        try{
            taskAction.openPage();
            taskAction.signIn(user,password);
        }catch (NullPointerException e){
            System.out.println("NullPointerException thrown");
        }
    }

    @And("enter the submenu for validations")
    public void enterTheSubmenuForValidations() {
        taskAction.EntrarFormulario();
    }

    @And("check the title of the form on the screen")
    public void checkTheTitleOfTheFormOnTheScreen() {
        assert(taskAction.checkTitleForm().equals("Form Validation"));
    }

    @And("fill all the fields")
    public void fillAllTheFields(io.cucumber.datatable.DataTable dataTable){
        this.required = dataTable.cell(1,0);
        this.select = dataTable.cell(1,1);
        this.multipleSel = dataTable.cell(1,2);
        this.url = dataTable.cell(1,3);
        this.email = dataTable.cell(1,4);
        this.password2 = dataTable.cell(1,5);
        this.confirmPass = dataTable.cell(1,6);
        this.minfield = dataTable.cell(1,7);
        this.maxField = dataTable.cell(1,8);
        this.number = dataTable.cell(1,9);
        this.ip = dataTable.cell(1,10);
        this.date = dataTable.cell(1,11);
        this.past = dataTable.cell(1,12);


        taskAction.fillAllFields(required,select,multipleSel,url,email,password2,confirmPass,minfield,maxField,number,ip,date,past);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("click the button validate")
    public void clickTheButtonValidate() {
        taskAction.clickValidate();
    }

    @Then("field required will be empty")
    public void fieldRequiredWillBeEmpty() {
        assert(taskAction.checkFieldRequired());
    }
}
