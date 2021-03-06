import config.*;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Homepage;
import pageObjects.LiveChatPopup;

import java.util.concurrent.TimeUnit;


public class LiveChatTest {

    private static final Logger log = Logger.getLogger(HomepageSearchTest.class);

    static WebDriver driver = null;
    static Homepage homepage = null;
    static LiveChatPopup liveChat = null;

    @BeforeClass
    public static void beforeAll() {
        log.info("Running spec: LiveChatSpec");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        homepage = new Homepage(driver);
        liveChat = new LiveChatPopup(driver);
    }

    @AfterClass
    public static void afterAll() {
        driver.quit();
    }

    @Before
    public void beforeEach() {
        driver.manage().deleteAllCookies();
    }

    @After
    public void afterEach() {

    }


    @Test
    public void OpenLiveChat() {
        log.info("Open Baseurl: " + Config.baseUrl);
        driver.get(Config.baseUrl);

        String mainWindow = driver.getWindowHandle();

        log.info("Open livechat popup");
        homepage.LiveChatButton.click();

        //Switch to popup window
        for(String popup : driver.getWindowHandles()){
            if (!popup.equals(mainWindow)){
                log.info("Switch to popup window");
                driver.switchTo().window(popup);
            }
        }

        log.info("Populate email, username, message");

        liveChat.LiveChatEmailField.sendKeys("invalid email");
        liveChat.LiveChatUsernameField.clear();
        liveChat.LiveChatUsernameField.sendKeys("username");
        liveChat.LiveChatMessageField.sendKeys("Test message. please ignor");

        log.info("Hit send button");
        liveChat.LiveChatSendButton.click();

        String ErrorMessage = liveChat.LiveChatErrorMessage.getText();
        log.info("Message: " + ErrorMessage + "\n");
        Assert.assertEquals("Please fill \"Your email\" correctly.", ErrorMessage);

    }

}
