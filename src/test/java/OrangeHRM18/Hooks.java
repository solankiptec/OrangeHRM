package OrangeHRM18;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.ITestResult;
import sun.text.normalizer.Utility;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    @Before
    public void openBrowser()
    {
        BrowserSelector browserSelector = new BrowserSelector();
        LoadProp loadProp = new LoadProp();
        browserSelector.selectBrowser(loadProp.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(loadProp.getProperty("baseUrl"));
        driver.manage().deleteAllCookies();

    }


//@After
////    public void TearDown(ITestResult result){
////        If(ITestResult.FAILURE==result.getStatus()){
////
////        Utility.captureScreenshot(driver,result.getName());
////    }
//    driver.quit();
//}
//
//
}
