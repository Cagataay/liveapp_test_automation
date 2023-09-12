package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static java.lang.Math.abs;


public class ElementHelper extends ElementLocator {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,(20));
        this.action = new Actions(driver);
    }
    public WebElement presenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void click(By key){
        findElement(key).click();  // click --- tiklama islevini gerceklestirir
    }

    public void sendKeys(By key , String text){
        findElement(key).sendKeys(text);   //sendKeys --- text gonderimini saglar
    }

    public void checkVisible(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));

    }

    // Ilgili nesneye ait text bilgisinin kontrolu saglanir
    public void checkText(By key , String text){
        if (!findElement(key).getText().equals(text)) {
            Assert.fail("The text on the expected screen is incorrect.");
        }
    }

    // Sayfayi yukari dogru kaydirma islemi gerceklestirir
    public void scrollPageUp(AppiumDriver driver, double startPercentage, double endPercentage) {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int startY = (int) (size.height * endPercentage);
        int endY = (int) (size.height * startPercentage);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction()
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    // Sayfayi asagi dogru kaydirma islemi gerceklestirir
    public void scrollPageDown(AppiumDriver driver, double startPercentage, double endPercentage) {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int startY = (int) (size.height * startPercentage);
        int endY = (int) (size.height * endPercentage);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction()
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    // Buton olarak gozukmeyen alana tiklatma islemi
    public void clickNotButtonElement(By key){
        WebElement parentElement = driver.findElement(key);
        Point parentLocation = parentElement.getLocation();
        Dimension parentSize = parentElement.getSize();
        int parentX = parentLocation.getX();
        int parentY = parentLocation.getY();
        int parentWidth = parentSize.getWidth();
        int parentHeight = parentSize.getHeight();

        int targetX = parentX + parentWidth - 1;
        int targetY = parentY + parentHeight / 2;

        new TouchAction(driver).tap(PointOption.point(targetX, targetY)).perform();
    }

    // Ogelerin sayisini almak icin kullanilir
    public int getNumberOfElements(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        return elements.size();
    }

    public void backWithoutKey(){
        driver.navigate().back();
    }

    public void setWait(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Ekranin sag alt tarafinda klavyedeki enter butonuna tiklatma islemi
    public void clickEnterButton(){
        Dimension screenSize = driver.manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        int targetX = screenWidth - 1;
        int targetY = screenHeight - 1;

        TouchAction action = new TouchAction(driver);
        action.tap(PointOption.point(targetX, targetY)).perform();
    }

    // Elementten text bilgisini alma islemi
    public String getTextFromElement(By key){
        String elementText=driver.findElement(key).getText();
        return elementText;
    }

    // Son elementin metnini dondurur
    public String getLastElementText(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        return elements.get(elements.size()-1).getText();
    }

    // Elemente istenilen sure kadar tiklatma islemi yaptirir
    public void performClickActionWithDuration(By key,int time) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(driver.findElement(key)))
                        .withDuration(Duration.ofSeconds(time)))
                .release()
                .perform();

    }

    // Klavye acik oldugunda clipboard'a tiklatma islemi
    public void processClipboardData(){
        Dimension screenSize = driver.manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        int centerX = screenWidth / 2;
        int centerY = (int) (screenHeight * 0.65); // Ekranın ortasından biraz aşağıda tıklamak için y değerini düşürebilirsiniz.

        TouchAction action = new TouchAction(driver);
        action.tap(PointOption.point(centerX, centerY)).perform();
    }

    public void waitUntilElementIsVisible(WebElement element , int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void holdTheElement(By by){ //bir elemente basılı tutmak için
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        waitUntilElementIsVisible(element,20);
        action.clickAndHold(element).perform();
    }

    public void releaseTheElement(By by){ //basılı tutulan elementi bırakmak için
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        waitUntilElementIsVisible(element,20);
        action.release(element).perform();
    }

    public void holdAndRelease(By by, int time){ //6 saniye basılı tutup çekmek için
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        waitUntilElementIsVisible(element,20);
        action.clickAndHold(element).perform();
        setWait(time);
        action.release(element).perform();
    }

    public boolean isDisplayed(By by){
        try{
            WebElement element = driver.findElement(by);
            waitUntilElementIsVisible(element,10);
            return element.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }

    public void dragThisCoordinate(By by, int x, int y){ //you can use this method for swipe right or left
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        action.dragAndDropBy(element,x,y).perform();
    }
}