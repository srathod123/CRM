package com.automation.Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends BaseActions {
    WebDriver Driver;
    public DashBoardPage(WebDriver Driver){
        super(Driver);
        this.Driver = Driver;
    }
    public String getWelcomeMessage(){
        return getText("DashBoardPage.welcomeMsg");
    }
}
