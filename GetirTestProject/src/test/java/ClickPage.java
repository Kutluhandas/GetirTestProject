import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClickPage extends BaseTest{

    @Step("Click on element with id <id>")
    public void clickById(String id) {
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.id(id))));
        appiumDriver.findElement(By.id(id)).click();
    }

    @Step("Click on element with xpath <xpath>")
    public void clickByXpath(String xpath){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.xpath(xpath))));
        appiumDriver.findElement(By.xpath(xpath)).click();
    }

    @Step("Click on both elements with <xpath>")
    public void click2ByXpath(String xpath){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.xpath(xpath))));
        for(int i = 0; i<= 1; i++){
            appiumDriver.findElement(By.xpath(xpath)).click();
        }
    }

    @Step("User goes to element with <id> and checks <xpath1> and <xpath2>")
    public void checkProductAndPrices(String id, String xpath1, String xpath2)
    {
        appiumDriver.findElement(By.id(id)).click();
        Assert.assertNotEquals("The product in the cart does not match with the received", "Sample Item",
                appiumDriver.findElement(By.xpath(xpath1)).toString());
        System.out.println("Control of 'Product name in cart matches with received' is successful");
        Assert.assertNotEquals("The prices are not the same", "$1,98",
                appiumDriver.findElement(By.xpath(xpath2)).toString());
        System.out.println("Control of 'The prices are the same is successful");
    }

}
