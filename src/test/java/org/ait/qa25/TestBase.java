package org.ait.qa25;

import org.ait.firstSeleniumProject.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp(){
        app.init();

    }

    @AfterMethod (enabled = false)
    public void tearDown(){
        app.stop();
    }

}
