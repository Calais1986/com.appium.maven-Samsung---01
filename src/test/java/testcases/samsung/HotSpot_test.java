package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotSpot_test {


    public static String test(AndroidDriver driver) {

        List<WebElement> elements;
        String client_ip = null;
        String connected_device_exist = null;

        try {
            clean_phone_history.test(driver);
            driver.navigate().back();
            driver.navigate().back();

            driver.findElement(new AppiumBy.ByAccessibilityId("Settings")).click();
           /* driver.sendKeyEvent(AndroidKeyCode.KEYCODE_APP_SWITCH);
            Thread.sleep(1000);
            driver.findElementById("com.sec.android.app.launcher:id/clear_all_button").click();
            Thread.sleep(2000);
            driver.launchApp();*/
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Connections\").instance(0))")).click();
            Thread.sleep(3000);
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mobile Hotspot and Tethering\").instance(0))")).click();
            Thread.sleep(4000);
            //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Mobile Hotspot\").instance(0))").click();
            driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("com.android.settings:id/button_text")).click();
            Thread.sleep(3000);
            //com.android.settings:id/ssid_edit_oneui_3_0

            elements = driver.findElements(By.id("com.android.settings:id/ssid_edit_oneui_3_0"));
            //Por cada elemento encontrado da lista aquele que tiver indicação de "String" é selecionado para clickar on
            for (WebElement element : elements) {

                if(element.getText().equals("MasterAP")) {
                    Thread.sleep(3000);
                    //driver.navigate().back();
                }
                //se nenhum for encontrado configura a rede
                Thread.sleep(3000);
                if (driver.findElement(By.id("com.android.settings:id/ssid_edit_oneui_3_0")).isDisplayed()){
                    driver.findElement(By.id("com.android.settings:id/ssid_edit_oneui_3_0")).sendKeys("MasterAP");
                }
                Thread.sleep(3000);
            }
            Thread.sleep(4000);
            elements = driver.findElements(By.id("com.android.settings:id/password_edit_oneui_3_0"));
            for (WebElement element : elements) {

                if(element.getText().equals("12345678")) {
                    Thread.sleep(3000);
                    //driver.navigate().back();
                }
                //se nenhum for encontrado configura apass
                Thread.sleep(3000);
                if (driver.findElement(By.id("com.android.settings:id/password_edit_oneui_3_0")).isDisplayed()){
                    driver.findElement(By.id("com.android.settings:id/password_edit_oneui_3_0")).clear();
                    driver.findElement(By.id("com.android.settings:id/password_edit_oneui_3_0")).sendKeys("12345678");
                }
                Thread.sleep(3000);
            }
            Thread.sleep(4000);

            if (driver.findElement(By.id("com.android.settings:id/save_button")).isDisplayed()){
                driver.findElement(By.id("com.android.settings:id/save_button")).click();
            }
            elements = driver.findElements(By.id("com.android.settings:id/switch_widget"));
            //Por cada elemento encontrado da lista aquele que tiver indicação de Off é selecionado para clickar on
            System.out.println("MS1");
            for (WebElement element : elements) {

                if (element.getText().equals("Off")) {
                    Thread.sleep(3000);
                    element.click();
                    Thread.sleep(3000);
                    //driver.navigate().back();
                }
                else{
                    driver.navigate().back();
                }
            }
            System.out.println("MS2");
            Thread.sleep(5000);
            elements = driver.findElements(By.id("android:id/button1"));
            //Por cada elemento encontrado da lista aquele que tiver indicação de Off é selecionado para clickar on
            for (WebElement element : elements) {
                if (element.getText().equals("Turn off")) {
                    Thread.sleep(3000);
                    element.click();
                    Thread.sleep(3000);
                } else {
                    driver.navigate().back();
                }
            }
            System.out.println("MS3");
            int counter=1;
            while (connected_device_exist==null && counter <10){
                Thread.sleep(15000);
                elements = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView"));
                for (WebElement element : elements) {
                    if(element.getText().equals("Connected device")){
                        Thread.sleep(3000);
                        connected_device_exist="yes";
                        element.click();
                        Thread.sleep(3000);
                        break;
                    }
                }
                counter++;
                System.out.println(counter);
            }
            System.out.println("MS4");
            elements = driver.findElements(By.id("com.android.settings:id/wifi_ap_ip"));
            for (WebElement element : elements){
                if(element.getAttribute("resource-id").equals("com.android.settings:id/wifi_ap_ip")){
                    client_ip = element.getText();
                }
            } 
            Thread.sleep(3000);
          //  driver.sendKeyEvent(AndroidKeyCode.HOME);
          /*  if(!driver.isAppInstalled("com.lipinic.ping")){
                driver.installApp("kobiton-store:v500188");
                capabilities.setCapability("appPackage", "com.lipinic.ping");
                capabilities.setCapability("appActivity", "");
                driver.launchApp();
            }
            else{
                System.out.println("nao instalei app mas ip é" + client_ip);
            }*/
            System.out.println("Ip do cliente HotSpot é " + client_ip);
            if (client_ip != null){
            return "OK";}
            else {return "NOK";}

            }
        catch (Exception e) {
            e.printStackTrace();
            return "NOK";
        }


    }
}
