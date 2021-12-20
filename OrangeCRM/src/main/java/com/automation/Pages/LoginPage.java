package com.automation.Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseActions {
    WebDriver Driver;
    public LoginPage(WebDriver Driver){
        super(Driver);
        this.Driver = Driver;
    }

    public LoginPage enterUsername(String name) throws Exception{
        //ClickIt("LoginPage.tbx_Username");
        //ClearText("LoginPage.tbx_Username");
        typeTextInto("LoginPage.tbx_Username",name);
        return this;
    }

    public LoginPage enterPassword(String password)throws Exception{
        //ClickIt("LoginPage.tbx_Password");
        //ClearText("LoginPage.tbx_Password");
        typeTextInto("LoginPage.tbx_Password",password);
        return this;
    }

    public DashBoardPage clickSubmit()throws Exception{
        ClickIt("LoginPage.btn_Submit");
        return new DashBoardPage(Driver);
    }
}
