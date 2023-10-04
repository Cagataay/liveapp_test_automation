package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.ElementLocator;

import javax.swing.*;

public class FollowingsPages extends ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public FollowingsPages(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
        this.elementHelper = new ElementHelper(driver);

    }
    //EMAİL:hahaha@hahaha.hahaha
    //ŞİFRE:qazwsx123 ----> followings tabını yazarken yayın açtığım gıcır global user
    String fourPersonPK = "Team War";
    String PK = "In battle";
    String MGS ="Multi-Guest";


    public void clickFollowingsNavbar() {
        click(ElementLocator.FOLLOWING_NAVBAR);


    }
    public void checkFollowingsLoginButton(){
        checkVisible(ElementLocator.BUTTON_LOGIN);
    }
    public void checkNonstreamPage(){
        checkVisible(ElementLocator.FOLLOWINGS_NONSTREAM);
    }
    public void checkStreamCard(){
        checkVisible(ElementLocator.STREAM_CARD);
    }
    public void checkFourPersonPK(){
        checkText(ElementLocator.PK_BADGE_TEXT,fourPersonPK);
    }
    public void checkPkStreamCard(){
        checkText(ElementLocator.PK_BADGE_TEXT,PK);
    }
    public void checkMgsStreamCard(){
        checkText(ElementLocator.MGS_BADGE_TEXT,MGS);
    }
    public void checkPremiumStreamCard(){
        checkVisible(ElementLocator.PREMIUM_BADGE);
    }

}
