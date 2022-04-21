package org.example;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;




import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends BaseTest {

    @Step("<key> saniye bekle")
    public void waitSecond(int key) throws InterruptedException{
        Thread.sleep(key *1000);
    }

    @Step("<key> xptahli elementine tikla")
    public void clickElementByXpath(String key){
        driver.findElement(By.xpath(key)).click();
    }

    @Step("<key> cssli elementine tikla")
    public void clickElementByCss(String key){
        driver.findElement(By.cssSelector(key)).click();
    }

    @Step("<key> elementi bul ve <text> degerini cssselector ile yazdir")
    public void SendKeyByCss(String element, String key){
        driver.findElement(By.cssSelector(element)).sendKeys(key);
    }

    @Step("<key> elementi bul ve <text> degerini xpath ile yazdir")
    public void SendKeyByXpath(String element, String key){
        driver.findElement(By.cssSelector(element)).sendKeys(key);
    }

}
