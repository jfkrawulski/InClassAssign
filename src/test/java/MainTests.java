import org.junit.Assert;
import org.junit.Test;

/**
 * Created by johnkrawulski on 6/27/17.
 */
public class MainTests {

    HomePage utils = new HomePage();

    public static final String HOME_PAGE = "http://www.homedepot.com";


    @Test
    public void startTestsHere(){

    //Selenium project step 1
        Assert.assertTrue("Unable to Navigate to "+HOME_PAGE, utils.navigateURL(HOME_PAGE));
        System.out.println("Successfully navigated to "+HOME_PAGE);

        Assert.assertTrue("Unable to find Search Box", utils.validateSearchBox());
        System.out.println("Confirmed Search Box displayed");



}

}
