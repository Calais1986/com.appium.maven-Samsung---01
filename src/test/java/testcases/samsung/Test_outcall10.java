package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

//import io.appium.java_client.TouchAction;
//import io.appium.java_client.touch.WaitOptions;

public class Test_outcall10 {

    //	@SuppressWarnings("rawtypes")
    public static String test(AndroidDriver driver, String kobitonSessionId) {
        try {
            driver.pressKey(new KeyEvent(AndroidKey.HOME));//driver.sendKeyEvent(AndroidKeyCode.HOME);

            // AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL(kobitonServerUrl), capabilities);

            //String kobitonSessionId = driver.getSessionId().toString();

            driver.findElement(AppiumBy.accessibilityId("Telefone"));
            driver.findElement(AppiumBy.accessibilityId("Telefone")).click();

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

// verificar a pagina de entrada da app das chamadas por fazer:

// fim de verificação

// inicia o ciclo de 10


// procura por elemento dos digitos sobre os numeros a discar
                //WebElement el2 = null;
                //WebElement el10= null;
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Keypad\").instance(0))")).click();
                try {
                    if (driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/digits")).isEnabled()) {
                        driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/digits")).click();
                    }
                } catch (Exception e) {
                    if (!driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/digits")).isDisplayed() && driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.samsung.android.dialer:id/tab_text_container\"])[1]")).isDisplayed()){
                        driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.samsung.android.dialer:id/tab_text_container\"])[1]")).click();
                        if (driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/digits")).isEnabled()){
                            driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/digits")).click();
                        }
                    }
                }

                //WebElement el10 =driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.samsung.android.dialer:id/tab_text_container\"])[1]"));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //if (el2!=null) {
                 //   el2.click();
            driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/digits")).sendKeys("931070101");
                //} else if (el2==null && el10!= null){
                  //   el10.click();
                   // el2.click();
                   // el2.sendKeys("931070101");
                //}
            for (int i = 1; i <= 2; i++) {
// procura o botão de realizar chamada
                if( driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/dialButtonImage")).isDisplayed()){
                    driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/dialButtonImage")).click();

                    if (i==2){
                    driver.findElement(AppiumBy.id("com.samsung.android.dialer:id/dialButtonImage")).click();

                }
                }

// esperar 30 segundos
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
// procura botao de end call
                WebElement el4 =  driver.findElement(AppiumBy.accessibilityId("End call"));
                el4.click();
//espera de 5 segundos e reinicia o ciclo
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

            /*MobileElement el5 = (MobileElement) driver.findElementById("com.samsung.android.dialer:id/digits");
            el5.click();
            el5.sendKeys("112");
// procura o botão de realizar chamada
            MobileElement el6 = (MobileElement) driver.findElementById("com.samsung.android.dialer:id/dialButtonImage");
            el6.click();

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MobileElement el7 = (MobileElement) driver.findElementById("com.samsung.android.incallui:id/voice_disconnect_button");
            el7.click();*/
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.navigate().back();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "OK";
            //Termina o WebDriver da sessão como completed
            //Checkar como dar sessão como passed

           // System.out.println(kobitonSessionId);
            // driver.quit();

        } catch ( NoSuchElementException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "NOK";

        }



    }

}