package com.automation.Tests;
import Components.DataProviderArgs;
import Components.DataProviderUtils;
import Components.TestActions;
import Helpers.DataGenerator;
import Helpers.TestAsserts;
import com.automation.Pages.DashBoardPage;
import com.automation.Pages.LoginPage;
import org.testng.annotations.Test;
import java.sql.Driver;

public class LoginTest extends TestActions {

    @DataProviderArgs("demoTest=username,password,welcome")
    @Test(dataProviderClass = DataProviderUtils.class,dataProvider = "jsonDataProvider",description = "Login functionality")
    public void demoTest(String username, String password, String welcome) throws Exception {
        LoginPage loginpage = new LoginPage(Driver.get());
        System.out.println(username + "=" + password);
        Thread.sleep(3000);
        DashBoardPage dashboard = loginpage.enterUsername(username)
                .enterPassword(password)
                .clickSubmit();
        Thread.sleep(3000);
        String welcomes = dashboard.getWelcomeMessage();
        Thread.sleep(3000);
        TestAsserts.checkIfValuesAreEquals(welcomes,welcome);
        System.out.println(welcomes);
    }

   // @Test()
   // public void TestUsingRandomData() throws Exception {
      //  String username = DataGenerator.getUsername();
        //String password = DataGenerator.getPassword();
        //LoginPage loginpage = new LoginPage(Driver.get());
        //DashBoardPage dashboard = loginpage.enterUsername(username).enterPassword(password).clickSubmit();
        //String wlcmMsg = dashboard.getWelcomeMessage();
        //System.out.println(username);
        //System.out.println(password);
        //System.out.println(wlcmMsg);
        //Thread.sleep(3000);
        //TestAsserts.checkIfValuesAreEquals(wlcmMsg,"Tarun Sachdeva");
    //}
}
