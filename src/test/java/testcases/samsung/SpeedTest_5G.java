package testcases.samsung;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpeedTest_5G {

    public static String test(AndroidDriver driver) {


        List<WebElement> elements;

        try {

          /*  driver.openNotifications();
            Thread.sleep(3000);
            if (driver.findElements(By.id("com.android.systemui:id/settings_button")).size() != 0) {
                Thread.sleep(1000);
                driver.findElementById("com.android.systemui:id/settings_button").click();
            }

            System.out.println("look for settings");
            Thread.sleep(3000);
            //abrir menu de connections
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Connections\").instance(0))").click();
            Thread.sleep(3000);

            //check Wifi e desliga
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Wi-Fi\").instance(0))").click();
            Thread.sleep(3000);
            elements = driver.findElements(By.id("com.android.settings:id/switch_text"));
            for (MobileElement element : elements) {

                //corre a lista de elementos caso nao seja null e escolhe o Off para clickar
                if (!elements.isEmpty()) {
                    if (element.getText().equals("On")) {
                        Thread.sleep(3000);
                        element.click();
                        Thread.sleep(3000);
                        driver.navigate().back();
                    }
                }
            }
            //check if icon 5G is present
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mobile Networks\").instance(0))").click();
            Thread.sleep(3000);
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Network Mode\").instance(0))").click();
            Thread.sleep(3000);

            driver.openNotifications();
            //String s = "android.widget.CheckedTextView";
            elements = driver.findElements(By.className("android.widget.CheckedTextView"));

            for (MobileElement element : elements) {

                if (element.getText().equals("5G/4G/3G/2G (auto connect)")) {
                    Thread.sleep(3000);
                    element.click();
                    Thread.sleep(3000);
                    driver.sendKeyEvent(AndroidKeyCode.HOME);

                }

            }
            */
            //Go Home Open SpeedTest

                driver.pressKey(new KeyEvent(AndroidKey.HOME));//driver.sendKeyEvent(AndroidKeyCode.HOME);
                driver.findElement(new AppiumBy.ByAccessibilityId("Speedtest")).click();
                //driver.launchApp();
                Thread.sleep(4000);
                String var_downlink_result = null;
                //for (int i = 1; i <= 2; i++) {


                if (driver.findElements(By.id("org.zwanoo.android.speedtest:id/go_button")).size() != 0) {
                    driver.findElement(By.id("org.zwanoo.android.speedtest:id/go_button")).click();
                }
                Thread.sleep(50000);

                if (driver.findElements(By.id("org.zwanoo.android.speedtest:id/closeIcon")).size() != 0) {
                    //
                    System.out.println("finalizei o teste");
                /*elements = driver.findElements(By.xpath("//android.widget.FrameLayout[@content-desc=\"DOWNLOAD\"]/android.view.ViewGroup/android.widget.TextView[1]"));
                for (MobileElement element : elements) {

                    if (element.getText().equals("DOWNLOAD")) {
                        System.out.println("encontrei finalizei o teste");
                        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                        Thread.sleep(3000);
                    }
                }*/

                    elements = driver.findElements(By.xpath("//android.widget.FrameLayout[@content-desc=\"DOWNLOAD\"]/android.view.ViewGroup/android.widget.TextView[3]"));
                    for (WebElement element : elements) {

                        if (element.getAttribute("resource-id").equals("org.zwanoo.android.speedtest:id/txt_test_result_value")) {
                            System.out.println("encontrei o resultado");
                            var_downlink_result = element.getText();
                            System.out.println(var_downlink_result);
                            driver.findElement(By.id("org.zwanoo.android.speedtest:id/closeIcon")).click();
                        }
                           /* if (i == 1) {
                            driver.navigate().back();
                            Thread.sleep(3000);
                            }
                        else if (i == 2)
                            //    elements = driver.findElements(By.xpath("android.widget.FrameLayout[@content-desc=\"DOWNLOAD\"]/android.view.ViewGroup/android.widget.TextView[3]"));
                                if (element.getAttribute("resource-id").equals("org.zwanoo.android.speedtest:id/txt_test_result_value")) {
                                    System.out.println("encontrei o resultado");
                                    var_downlink_result = element.getText();
                                    driver.navigate().back();
                                }
                            }*/
                        //driver.navigate().back();
                    }
                }
                //driver.findElementById("org.zwanoo.android.speedtest:id/closeIcon").click();
            //}
                //android.widget.FrameLayout[@content-desc="DOWNLOAD"]/android.view.ViewGroup/android.widget.TextView[3]
                // }


                //driver.findElementById("org.zwanoo.android.speedtest:id/go_button").click();

                //File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                System.out.println(var_downlink_result);
                return var_downlink_result;
                //File ssfile =new File("screenshot.jpg");
                //FileUtils.copyFile(scrFile,ssfile);
                //abrir settings
                //capabilities.setCapability("appPackage", "com.android.settings");
                //capabilities.setCapability( "appActivity", "com.android.settings.Settings");
                //driver.launchApp();

                //ligar o 5G caso nao esteja


                // abrir as notificaçoes


                //checkar o icon do 5G


                //abrir app speeed test


                //correr um speed test


                //checkar valores do speed Test e registar




            }
        catch (Exception e ) {
            e.printStackTrace();
            return "NOK";
        }


    }


    }










