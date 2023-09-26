package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.ElementLocator;

import javax.swing.*;

public class SearchBarPages extends ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public SearchBarPages(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
        this.elementHelper = new ElementHelper(driver);

    }

    String userName = "Ahm";
    String sharedID = "6400001";
     String ID = "4120010";

    public void clickSearchBarButton() {
        click(ElementLocator.SEARCH_BAR_BUTTON);
    }

    public void writeSearchBarButton() {
        sendKeys(ElementLocator.SEARCH_BAR_LABEL, userName);
    }

    public void showSearchResult() {
        checkVisible(ElementLocator.SEARCH_RESULT);
    }
    public void foundUserFollow(){
        checkVisible(ElementLocator.SEARCH_BAR_FOLLOW);
        click(ElementLocator.SEARCH_BAR_FOLLOW);


    }
    public void closeSearchBar(){
        click(ElementLocator.SEARCH_BAR_CLOSE);
        checkVisible(ElementLocator.SEARCH_RESULT);
    }
    public void writeNumberSearchBar(){
        sendKeys(ElementLocator.SEARCH_BAR_LABEL, sharedID);
    }


    public void clickCanceledButtonPopup(){
        click(ElementLocator.LOGIN_POPUP_CLOSE);
    }
    public void sameUserUnfollow(){
        click(ElementLocator.SEARCH_BAR_UNFOLLOW);
        click(ElementLocator.UNFOLLOW_POPUP);
    }
    public void writeNonglobalNumberSearchbar(){
        sendKeys(ElementLocator.SEARCH_BAR_LABEL,ID);
    }
    public void checkUnfollowButton(){
        checkVisible(ElementLocator.SEARCH_BAR_UNFOLLOW);
    }
    public void checkFollowButton(){
        checkVisible(ElementLocator.SEARCH_BAR_FOLLOW);
    }
    public void checkUserLayout(){
        checkVisible(ElementLocator.SEARCH_BAR_USER_LAYOUT);
    }
    public void checkEmptySearchView(){
        checkVisible(ElementLocator.EMPTY_SEARCH_VIEW);
    }

    public void clickBackButton(){
        click(ElementLocator.BTN_BACK);
    }
    public void checkEmptyDiscoverPage(){
        checkVisible(ElementLocator.EMPTY_DISCOVER_PAGE);
    }
}





