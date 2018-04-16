package PageObject;

import OrangeHRM18.BasePage;
import OrangeHRM18.Utils;
import org.openqa.selenium.By;


public class HomePage extends Utils {
    public void enterLogInCredentials(String uname, String pward){

        Utils.clearAndEnter(By.id("txtUsername"),uname);
        Utils.clearAndEnter(By.id("txtPassword"),pward);
        Utils.clickElement(By.id("btnLogin"));
    }

}
