package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class test_apn_values {


    public static String test(AndroidDriver driver) {




        try {
            //AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL(kobitonServerUrl), capabilities);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
               // driver.findElement(AppiumBy.accessibilityId("Phone"));

                driver.findElement(AppiumBy.accessibilityId("Settings")).click();
                //driver.findElement(MobileBy.AccessibilityId("Settings"));
            }catch(Exception a){

            }




            // System.out.println("go home");
            //driver.sendKeyEvent(AndroidKeyCode.HOME);

            // System.out.println("menu");
            // driver.sendKeyEvent(AndroidKeyCode.ACTION_UP);

            //(new TouchAction(driver)).tap(974, 205).perform();
            //(new TouchAction(driver)).press( 832, 2356).moveTo(561,1054).release().perform();
            //new TouchAction(driver).

            //driver.sendKeyEvent(AndroidKeyCode.MENU);
            //ku = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MENU);
            //kd = new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MENU);
            //driver.sendKeyEvent(AndroidKeyCode.ACTION_UP);


            System.out.println("look for settings");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //MobileElement elset = (MobileElement) driver.findElementByAccessibilityId("Settings");
            //elset.click();

            //WaitUtils.waitForPresence(driver, 30, "com.android.systemui:id/qs_button_container");
            //MobileElement el1 = (MobileElement) driver.findElementById("com.android.systemui:id/qs_button_container");
            //WaitUtils.waitForPresence(driver,30,"com.android.systemui:id/qs_button_container");
            //el1.click();
            //(new TouchAction(driver)).tap(974, 205).perform();
            //System.out.println("vou executar o script");
            //String script =" am start -W -n com.android.settings/com.android.settings.Settings -S -a android.intent.action.MAIN -c android.intent.category.LAUNCHER -f 0x10200000";
            //driver.executeScript("getprop > getprop.txt");
            //System.out.println("executei o script");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                WebElement el2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]"));
                //WaitUtils.waitForPresence(driver,5,"hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]\"");

                el2.click();
            }catch(Exception a){}

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mobile networks\").instance(0))")).click();

            }catch(Exception a){}
            //WaitUtils.waitForPresence(driver,30,"com.android.systemui:id/qs_button_container");

            //MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
            //el3.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Access Point Names\").instance(0))")).click();

            }catch(Exception a){

            //MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
            //el4.click();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //MobileElement el5 = (MobileElement) driver.findElementById("com.android.settings:id/text_layout");
            //el5.click();
            String v1stat;
            v1stat = "";
            String result = "";
            try {
                if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Internet\").instance(0))")).isDisplayed()) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"umts\").instance(0))")).isDisplayed()) {
                        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"umts\").instance(0))")).click();

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        v1stat = "Passed APN umts found";
                        result = "OK";



                    }
                }
                else{
                    v1stat ="Failed APN not found - umts";
                    result = "NOK";
                }
            }catch(Exception a){}

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test done result as" + v1stat);
            return result;


        } catch ( Exception a) {
            a.printStackTrace();
            return "NOK";
        }

    }


}
