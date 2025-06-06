package utils;


import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitUtils {
        public static WebElement mobileElement;

        public static boolean waitForPresence(AndroidDriver driver, Duration timeLimitInSeconds, String targetResourceId){

                boolean isElementPresent;
                try{
                        mobileElement =  driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\""+targetResourceId+"\")"));
                        WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
                        wait.until(ExpectedConditions.visibilityOf(mobileElement));
                        isElementPresent = mobileElement.isDisplayed();
                        return isElementPresent;
                }catch(Exception e){
                        isElementPresent = false;
                        System.out.println(e.getMessage());
                        return false;
                }
        }
}