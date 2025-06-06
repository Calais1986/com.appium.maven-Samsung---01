package testcases.samsung;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

//import io.appium.java_client.TouchAction;
//import io.appium.java_client.touch.WaitOptions;

public class clean_phone_history {

    //	@SuppressWarnings("rawtypes")
    public static void test(AndroidDriver driver) {
        try {
            //driver.pressKeyCode(187, undefined, undefined);
            //driver.pressKeyCode
            //driver.pressKey(187);
            try {
                driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
            }catch (Exception a){}
            //driver.presskey(187);
            //driver.sendKeyEvent(AndroidKeyCode.APP_SWITCH);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                driver.findElement(By.id("com.sec.android.app.launcher:id/clear_all_button")).click();
            } catch(Exception a)
            {
                //driver.sendKeyEvent(82);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    driver.navigate().back();
                }catch(Exception o){}
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.navigate().back();

        } catch ( org.openqa.selenium.NoSuchElementException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }



    }

}