package testcases.samsung;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ping {

    public static String test(AndroidDriver driver, String kobitonSessionId) {

        var el5 = driver.findElement(new AppiumBy.ByAccessibilityId("Ping"));
        el5.click();
        var el6 = driver.findElement(AppiumBy.id("com.lipinic.ping:id/editTextHost"));
        el6.sendKeys("8.8.8.8");
        var el7 = driver.findElement(AppiumBy.id("com.lipinic.ping:id/btnStartPing"));
        el7.click();
        var el8 = driver.findElement(AppiumBy.id("com.lipinic.ping:id/btnStartPing"));
        el8.click();






        return "ok";
    }

}
