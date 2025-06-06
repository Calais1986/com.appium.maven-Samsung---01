package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.ActionUtils;

import java.util.Map;

public class connection_5g {

    public static String test(AndroidDriver driver) {


        String output = "NOK";
                try {

                    try {
                        driver.findElement(new AppiumBy.ByAccessibilityId("NetMonster")).click();
                    } catch (Exception e) {
                        try {
                            driver.findElement(new AppiumBy.ByAccessibilityId("NetMonster 1 notification")).click();
                        } catch (Exception i) {

                        }
                    }

                    try {
                        Thread.sleep(1000 * 10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        driver.findElement(AppiumBy.id("cz.mroczis.netmonster:id/grant_permission")).click();
                    } catch (Exception i) {

                    }
                    try {
                        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
                    } catch (Exception i) {

                    }
                    try {
                        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Consent\"]")).click();
                    } catch (Exception i ){

                    }



           // if (driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).isEnabled()){
           //     driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
           // }
          //  if (driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Consent\"]")).isEnabled()){
          //      driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Consent\"]")).click();
           // }


            //MobileElement element = driver.findElementByAccessibilityId("cz.mroczis.netmonster:id/secondary_technology");
            String sec_rat_info="";
            int counter = 0;
            boolean exit_cond = false;
            while (!exit_cond) {

                WebElement element = null;
                try {
                    element = driver.findElement(By.id("cz.mroczis.netmonster:id/secondary_technology"));

                } catch( Exception i ) {}

                if (element !=null) {


                    sec_rat_info = element.getText();
                    System.out.println(sec_rat_info);

                    if (sec_rat_info.contains("5G ᛫ NSA") && !sec_rat_info.contains("Disconnected")) {
                        exit_cond = true;
                        output = "OK";
                    }

                }
                 if (counter > 25) {
                    exit_cond = true;
                    output = "NOK";
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter = counter + 1;
            }




            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            return output;

        } catch (NoSuchElementException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "NOK";
        }


        //driver.findElementById("com.android.vending:id/search_box_idle_text").click();
    }

}
