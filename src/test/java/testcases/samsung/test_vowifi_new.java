package testcases.samsung;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test_vowifi_new {
    public static String test(AndroidDriver driver) {

        try {

            driver.findElement(new AppiumBy.ByAccessibilityId("Settings")).click();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("look for settings");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //abrir menu de connections
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Connections\").instance(0))")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //abrir menu de modo voo

            if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Airplane mode\").instance(0))")).isDisplayed()){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Airplane mode\").instance(0))")).click();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //driver.findElements(MobileBy.ByAndroidUIAutomator.linkText("Airplane mode");
                //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Off\").instance(0))").isDisplayed())
                //Checka a DOM por id de elemento e cria uma lista com todos os encontrados
                List<WebElement> elements = driver.findElements(By.id("com.android.settings:id/switch_text"));
                //Por cada elemento encontrado da lista aquele que tiver indicação de Off é selecionado para clickar on
                for (WebElement element : elements) {

                    if(element.getText().equals("Off")) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        element.click();
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //driver.navigate().back();
                    }
                    //se nenhum for encontrado com Off entao volta atras pois está On
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    driver.navigate().back();
                    System.out.println("advance to call");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //if (driver.findElements(By.linkText("Off")).size()!=0) {
                //Thread.sleep(3000);
                //driver.findElementById("com.android.settings:id/switch_widget").click();
                //Thread.sleep(3000);
                //driver.navigate().back();
                //}
                //else {
                //Thread.sleep(3000);
                //driver.navigate().back();
                System.out.println("avdance to call");
                //Thread.sleep(3000);
                //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Airplane mode\").instance(0))").click();
            }
            //abrir menu Wifi
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Wi\").instance(0))")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Verificar se o WiFi esta ligado
            //if(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Off\").instance(0))").isDisplayed()) {
            List<WebElement> elements = driver.findElements(By.id("com.android.settings:id/switch_text"));
            for (WebElement element : elements) {
                //corre a lista de elementos caso nao seja null e escolhe o Off para clickar
                if (!elements.isEmpty() && elements != null) {
                    if (element.getText().equals("Off")) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        element.click();
                        try {
                            Thread.sleep(30000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //driver.navigate().back();
                    }
                }
            }
            //Thread.sleep(3000);
            //driver.findElementById("com.android.settings:id/switch_widget").click();
            //Thread.sleep(30000);
            if (driver.findElements(By.id("com.android.settings:id/connected_network_category")).size() != 0) {
                //driver.findElements(By.id("Wi-Fi, On, Switch")).isEmpty()){
                //if (driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Current network\").instance(0))").isEnabled()) {
                boolean already_connected =false;

                try{
                    if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Connected Network\").instance(0))")).isEnabled()) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        already_connected =true;
                        driver.navigate().back();
                        System.out.println("advance to flight mode");
                    }
                } catch (Exception e){
                    e.getSuppressed();
                    System.out.println("Couldnt find Connected Network");

                }
                try{
                    if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Current network\").instance(0))")).isEnabled()) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        already_connected =true;
                        driver.navigate().back();
                        System.out.println("advance to flight mode");
                    }
                } catch (Exception e){
                    e.getSuppressed();
                    System.out.println("Couldnt find Current network");

                }

                if(already_connected ==false){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    driver.findElement(By.id("com.android.settings:id/switch_widget"));
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if //(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"w6e test\").instance(0))").isDisplayed()) {
                    (driver.findElements(By.name("MasterAP")).size() != 0) {
                        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"W6e test\").instance(0))")).click();
                        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"password\").instance(0))")).click();
                        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter password\").instance(0))")).sendKeys("12345678");
                        // substituir por
                        //com.android.settings:id/edittext sendkeys e enter
                        try {
                            Thread.sleep(30000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        String varset = "Not connected";
                        //WaitUtils.waitForPresence(driver,5000,"com.android.settings:id/shared_password_container");
                        driver.findElement(By.id("com.android.settings:id/shared_password_container")).click();
                        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Connect\").instance(0))").click();
                        if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Connected\").instance(0))")).isDisplayed())
                        {
                            varset = "connected";
                            //System.out.println(varset);
                        }
                        System.out.println(varset);
                    } else {
                        if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"LabSala6\").instance(0))")).isDisplayed()) {
                            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"LabSala6\").instance(0))")).click();
                        }
                    }
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    driver.navigate().back();
                }
            }
            if (driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Wi-Fi Calling\").instance(0))")).isDisplayed()){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Wi-Fi Calling\").instance(0))")).click();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                elements = driver.findElements(By.id("android:id/title"));

                for (WebElement element : elements) {
                    if (!elements.isEmpty() && elements != null) {
                        if (element.getText().equals("Off")) {
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            element.click();
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            driver.navigate().back();
                        }
                        driver.navigate().back();
                    }
                }
                /*if(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Off\").instance(0))").isDisplayed()){
                    driver.findElementById("android:id/switch_widget").click();
                    Thread.sleep(3000);
                }*/
                // else {driver.navigate().back();}
            }

            driver.pressKey(new KeyEvent(AndroidKey.HOME));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(new AppiumBy.ByAccessibilityId("Phone")).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (driver.findElements(By.id("com.sec.android.app.launcher:id/clear_all_button")).size() != 0){
                driver.findElement(By.id("com.sec.android.app.launcher:id/clear_all_button")).click();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}

            driver.findElement(By.id("com.samsung.android.dialer:id/digits")).sendKeys("931070101");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id("com.samsung.android.dialer:id/dialButtonImage")).click();
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (driver.findElement(By.id("com.samsung.android.incallui:id/voice_disconnect_button")).isDisplayed()) {
                String varset2 = "call VoWiFi sucessefull";
                driver.findElement(By.id("com.samsung.android.incallui:id/voice_disconnect_button")).click();
                System.out.println(varset2);
            }

            /*if(driver.findElements(By.id("com.sec.android.app.launcher:id/clear_all_button")).size() != 0) {

                if (driver.findElementById("com.samsung.android.incallui:id/voice_disconnect_button").isDisplayed()) {
                    String varset2 = "call VoWiFi sucessefull";
                    driver.findElementById("com.samsung.android.incallui:id/voice_disconnect_button").click();
                    System.out.println(varset2);
                }
            } */
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
            return "OK";
        } catch (Exception e) {
            e.printStackTrace();
            return "NOK";
        }
    }
}
