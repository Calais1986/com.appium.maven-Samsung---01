package testcases.samsung;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.NoSuchElementException;

public class iperf_client {


    public static String test(AndroidDriver driver,String kobitonSessionId) {
        try {

            var el1 = driver.findElement(AppiumBy.accessibilityId("iPerf3"));
            el1.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "nok";
            }
            var el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"));
            el2.sendKeys("192.168.1.143");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "nok";
            }
            var el3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.RadioButton\").instance(1)"));
            el3.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "nok";
            }
            var el4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Start\")"));
            el4.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
                return "nok";
            }
        } catch ( NoSuchElementException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "NOK";
        }


        return "ok";
    }
}
