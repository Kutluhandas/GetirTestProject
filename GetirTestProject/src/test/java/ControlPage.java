import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ControlPage extends BaseTest{

    @Step("Control of You are on the home page")
    public void checkHomePage(){
        Assert.assertNotEquals("You are not on the home page",
                appiumDriver.findElement(By.id("com.allandroidprojects.getirsample:id/action_notifications")),
                appiumDriver.findElement(By.id("com.allandroidprojects.getirsample:id/action_notifications")));
        System.out.println("Control of 'You are on the home page' is successful");
    }

    @Step("User checks the prices of element with <xpath>")
    public void checkPrices(String xpath)
    {
        Assert.assertNotEquals("The prices are not the same", "$1,98", appiumDriver.findElement(By.xpath(xpath)).toString());
        System.out.println("Control of 'The prices are the same is successful");
    }

    @Step("Checking if element with <xpath> is selected")
    public void CategoryPageControl(String xpath){
        Assert.assertTrue("You are not on the Baby Care page",appiumDriver.findElement(By.xpath(xpath)).isSelected());
        System.out.println("Control of 'You are on the Baby Care page' is successful");
    }

}
