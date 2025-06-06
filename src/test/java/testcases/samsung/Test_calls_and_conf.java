package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_calls_and_conf {

    public static String test(AndroidDriver driver) {


        try {
            try {

                driver.pressKey(new KeyEvent(AndroidKey.HOME));
                driver.findElement(AppiumBy.accessibilityId("Phone")).click();
                //driver.findElement(new AppiumBy.ByAccessibilityId("Phone")).click();
// verificar a pagina de entrada da app das chamadas
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Keypad\").instance(0))")).click();

                WebElement el2 = driver.findElement(By.id("com.samsung.android.dialer:id/digits"));
                el2.click();
                el2.sendKeys("931070101");

                WebElement el3 = driver.findElement(By.id("com.samsung.android.dialer:id/dialButtonImage"));
                el3.click();
            }catch(Exception a){}

            for(int i=1; i<=2; i++) {


                //MobileElement el3 = (MobileElement) driver.findElementById("com.samsung.android.dialer:id/dialButtonImage");
                //el3.click();

                if (i > 1) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    //MobileElement el5 =  (MobileElement) driver.findElementById("com.samsung.android.dialer:id/dialButtonImage");
                    //el5.click();
                }


                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //MobileElement el4 = (MobileElement) driver.findElementById("com.samsung.android.incallui:id/voice_disconnect_button");
                //el4.click();

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//to confirm from this to end anotation

                //el2.click();
                //el2.sendKeys("931070101");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                   // WebElement el5 = driver.findElement(By.id("com.samsung.android.incallui:id/first_button"));
                    //el5.click();
                    //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.incallui:id/incall_button_name\" and @text=\"Add call\"]")).click();
                    //var el14 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.samsung.android.incallui:id/incall_button_icon\"])[1]"));
                    //el14.click();
                    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Add call\").instance(0))")).click();
                } catch (Exception a) {
                    a.printStackTrace();
                }
                 //driver.findElement(AppiumBy.xpath("(android.widget.LinearLayout[@content-desc=\"Add call, Button\"]/android.view.ViewGroup")).click();


                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    WebElement el6 = driver.findElement(By.id("com.samsung.android.dialer:id/digits"));
                    //el6.click();
                    el6.sendKeys("931085158");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    WebElement el7 = driver.findElement(By.id("com.samsung.android.dialer:id/dialButtonImage"));
                    el7.click();

                } catch (Exception a) {

                }


                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    WebElement el8 = driver.findElement(By.id("com.samsung.android.incallui:id/merge_button"));
                    el8.click();
                    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Add call\").instance(0))")).click();

                } catch (Exception a) {
                    a.printStackTrace();
                }
                try {
                    if (driver.findElement(By.id("com.samsung.android.incallui:id/primary_name_or_number")).isDisplayed()) {
                        driver.findElement(By.id("com.samsung.android.incallui:id/primary_name_or_number")).click();
                        //driver.findElement(By.id("com.samsung.android.incallui:id/voice_disconnect_button").click();


//END anotation of new code
                        try {
                            Thread.sleep(30000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        //  driver.quit();


                        driver.findElement(By.id("com.samsung.android.incallui:id/voice_disconnect_button")).click();
                    }
                } catch (Exception a) {

                }
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id("com.samsung.android.incallui:id/voice_disconnect_button")).click();
            driver.navigate().back();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "OK";
        } catch (Exception e) {

            e.printStackTrace();
            return "NOK";

        }


        //driver.findElementById("com.android.vending:id/search_box_idle_text").click();
    }

}
