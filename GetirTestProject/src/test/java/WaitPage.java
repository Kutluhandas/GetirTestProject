import com.thoughtworks.gauge.Step;

public class WaitPage extends BaseTest{

    @Step("<x> seconds wait")
    public void waitForSecond(Long x) throws InterruptedException {
        Thread.sleep(1000*x);
    }

}
