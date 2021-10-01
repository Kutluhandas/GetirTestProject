import com.thoughtworks.gauge.Step;

public class NavigatePage extends BaseTest{

    @Step("User returns to previous page")
    public void previousPage(){
        appiumDriver.navigate().back();
    }

}
