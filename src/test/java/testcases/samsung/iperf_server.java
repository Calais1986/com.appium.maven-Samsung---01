package testcases.samsung;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.jetbrains.annotations.NotNull;

public class iperf_server {


    public static @NotNull String test(AndroidDriver driver) {

        var el4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
        el4.click();
        var el5 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Server\").instance(0)"));
        el5.click();
        var el6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Server\").instance(1)"));
        el6.click();
        var el7 = driver.findElement(AppiumBy.accessibilityId("Run"));
        el7.click();
        return "";
    }
}
