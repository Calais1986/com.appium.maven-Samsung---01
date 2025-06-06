package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class volte_test {

    public static String test(AndroidDriver driver) {


        try {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //driver.executeScript("");
            //Logger log = null;
            //log.info("Battery Info : " + batterInfo);
            //String var_cmd = "{command: logcat, args: [-h]}";
            driver.findElement(new AppiumBy.ByAccessibilityId("Phone")).click();
// verificar a pagina de entrada da app das chamadas

            WebElement el2 = driver.findElement(By.id("com.samsung.android.dialer:id/digits"));
            el2.click();
            el2.sendKeys("931070101");
            WebElement el3 =  driver.findElement(By.id("com.samsung.android.dialer:id/dialButtonImage"));
            el3.click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Object Info = driver.executeScript("mobile:deviceInfo");
            System.out.println(Info.toString());
            String result="";
            if(Info.toString().contains("subtypeName=LTE") == true){
                result="OK";
            }
            else{
                result="NOK";
            }

            WebElement el7 =  driver.findElement(By.id("com.samsung.android.incallui:id/voice_disconnect_button"));
            el7.click();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            return result;







            //Map<String, Object> args0 = new HashMap<>();
            //args0.put("command", "ls");
            //args0.put("args", Lists.newArrayList("arg1", "arg2"));
            //Object output = driver.executeScript(" am start -a android.settings.SETTINGS");
            //exec( "adb logcat -d > logcat.log" );
            //String output = String.valueOf(driver.executeScript("mobile: shell", args0));
            //assert output.equals("arg1 arg2");
            //System.out.println(output);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "NOK";
        }



    }

}

