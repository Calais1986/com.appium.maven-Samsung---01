package testcases.samsung;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


//@Test
public class test_sms_mms  {

    public static String test(AndroidDriver driver) {


        try {

            /*if (driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").isDisplayed()) {

               driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();

            }
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            try {
                driver.findElement(new AppiumBy.ByAccessibilityId("Messages")).click();
            } catch (Exception e) {
                driver.findElement(new AppiumBy.ByAccessibilityId("Messages, 1 notification")).click();
            }
            try {
            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Messages\" and @resource-id=\"com.sec.android.app.launcher:id/hotseat_icon\"]"));
            } catch (Exception e) {}

            Thread.sleep(5000);
            try{
            if(driver.findElement(AppiumBy.accessibilityId("Start chat")).isDisplayed())
            {
                driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
            }}
            catch(Exception a){

            }
            try{ if (driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/cancel_button")).isDisplayed()){driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/cancel_button")).click();}}catch(Exception a){}

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
try {
    WebElement ml1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));


    if (ml1.isDisplayed()) {
        ml1.click();
        ml1.sendKeys("931013588");
        //driver.sendKeyEvent(66);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        //driver.findElementById("com.samsung.android.messaging:id/fab").click();
    }
}catch(Exception a ){}
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

           /* if (driver.findElementById("com.samsung.android.messaging:id/recipients_editor_to").isDisplayed()) {

                driver.findElementById("com.samsung.android.messaging:id/recipients_editor_to").click();
                driver.findElementById("com.samsung.android.messaging:id/recipients_editor_to").sendKeys("931085158");
            }

            Thread.sleep(2000);

            if ( driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout\r\n").isDisplayed()){

                driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout\r\n").click();
            }

            Thread.sleep(2000);
            try {
                driver.hideKeyboard();
            } catch (Exception ignored) {

            }

            Thread.sleep(2000);*/

            try {
                driver.hideKeyboard();
            } catch (Exception ignored ) {
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
try {
    if (driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text")).isDisplayed()) {

        driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("Lara lira isahpfoqhrfpqjrewnfpqojewfpoqwnefnfpejrperonhf ljrgp	irfg+	ourwgf	+ogf+ ajregpquregpqreougp");
    }
}catch(Exception a){}
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //MMS tirar foto front e enviar
            try {
                if (driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).isDisplayed()) {

                    driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();
                }
            }catch(Exception a){}






            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (driver.findElement(By.id("com.google.android.apps.messaging:id/camera_gallery_button")).isDisplayed()){

                driver.findElement(By.id("com.google.android.apps.messaging:id/camera_gallery_button")).click();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(driver.findElement(By.id("com.google.android.apps.messaging:id/shutter_button")).isDisplayed()) {

                driver.findElement(By.id("com.google.android.apps.messaging:id/shutter_button")).click();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




            if (driver.findElement(By.id("com.google.android.apps.messaging:id/primary_button")).isDisplayed()) {

                driver.findElement(By.id("com.google.android.apps.messaging:id/primary_button")).click();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //  if(driver.findElementById("com.sec.android.app.camera:id/okay").isDisplayed()) {

            //    driver.findElementById("com.sec.android.app.camera:id/okay").click();
            //}

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).isDisplayed()){

                driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "OK";

            //  if(driver.findElementById("com.sec.android.app.camera:id/okay").isDisplayed()) {

            //      driver.findElementById("com.sec.android.app.camera:id/okay").click();
            //  }
            // Thread.sleep(7000);

            //if(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"OK\").instance(0))").isDisplayed())
            // {
            //     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"allow\").instance(0))").click();
            // }
            //  Thread.sleep(7000);
            // if(driver.findElementById("com.samsung.android.messaging:id/send_button1").isDisplayed()){

            //     driver.findElementById("com.samsung.android.messaging:id/send_button1").click();
            // }

        } catch (Exception ignored) {
            //e.printStackTrace();  //print element e erro no driver
            return "NOK";

        }

    }

}

