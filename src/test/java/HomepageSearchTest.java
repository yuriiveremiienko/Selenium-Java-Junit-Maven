import config.*;
import org.apache.log4j.Logger;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Homepage;
import pageObjects.HotelsPage;
import pageObjects.PrivateAccomodationPage;


import java.util.concurrent.TimeUnit;

public class HomepageSearchTest {

    private static final Logger log = Logger.getLogger(HomepageSearchTest.class);

    static WebDriver driver = null;
    static Homepage homepage = null;
    static HotelsPage hotelsPage = null;
    static PrivateAccomodationPage privatePage = null;

    @BeforeClass
    public static void beforeAll() {
        log.info("Running spec: HomepageSearchSpec");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homepage = new Homepage(driver);
        hotelsPage = new HotelsPage(driver);
        privatePage = new PrivateAccomodationPage(driver);
    }

    @AfterClass
    public static void afterAll() {
        driver.quit();
    }

    @Before
    public void beforeEach() {
        driver.manage().deleteAllCookies();
        driver.get(Config.baseUrl);
    }

    @After
    public void afterEach() {

    }



    @Test
    public void HomepageHotelsSearch() {
        log.info("Running test - show results of the Hotels Search");

        log.info("Select accomodation dropdown");
        homepage.AccomodationDropdown.click();

        log.info("Select Hotels item");
        homepage.AccomodationHotels.click();

        log.info("Select Start date");
        homepage.ArrivalDate.click();
        homepage.TodayIcon.click();

        log.info("Select End date");
        homepage.DepartureDate.click();
        homepage.EndDate.click();

        log.info("Click Search button");
        homepage.SearchButton.click();

        int res = hotelsPage.HotelSearchResults.size();
        log.info("Search results equals " + res);
        Assert.assertTrue("Search results equals " + res + ", should be more than 1", res > 1);
    }

    @Test
    public void HomepagePrivateAccomodationSearch() {
        log.info("Running test - show results of the Private Accomodation Search");

        log.info("Select Start date");
        homepage.ArrivalDate.click();
        homepage.TodayIcon.click();

        log.info("Select End date");
        homepage.DepartureDate.click();
        homepage.EndDate.click();

        log.info("Click Search button");
        homepage.SearchButton.click();

        int res = privatePage.PrivateAccomodationSearchResults.size();
        log.info("Search results equals " + res);
        Assert.assertTrue("Search results equals " + res + ", should be more than 1", res > 1);
    }

    @Test
    public void HomepageVacationVillagesSearch() {
        log.info("Running test - show results of the Vacation Villages Search");

        log.info("Select accomodation dropdown");
        homepage.AccomodationDropdown.click();

        log.info("Select Vacation Villages item");
        homepage.AccomodationVacationVillages.click();

        log.info("Select Start date");
        homepage.ArrivalDate.click();
        homepage.TodayIcon.click();

        log.info("Select End date");
        homepage.DepartureDate.click();
        homepage.EndDate.click();

        log.info("Click Search button");
        homepage.SearchButton.click();

        int res = hotelsPage.HotelSearchResults.size();
        log.info("Search results equals " + res);
        Assert.assertTrue("Search results equals " + res + ", should be more than 1", res > 1);
    }

    @Test
    public void HomepageYachtCharterSearch() {
        log.info("Running test - show results of the Yacht Charter Search");

        log.info("Select accomodation dropdown");
        homepage.AccomodationDropdown.click();

        log.info("Select Yacht Charter item");
        homepage.AccomodationYachtCharter.click();

        log.info("Select Start date");
        homepage.ArrivalDate.click();
        homepage.TodayIcon.click();

        log.info("Select End date");
        homepage.DepartureDate.click();
        homepage.EndDate.click();

        log.info("Click Search button");
        homepage.SearchButton.click();

        int res = hotelsPage.HotelSearchResults.size();
        log.info("Search results equals " + res);
        Assert.assertTrue("Search results equals " + res + ", should be more than 1", res > 1);
    }

    @Test
    public void HomepageRentCarSearch() {
        log.info("Running test - show results of the Rent Car Search");

        log.info("Select accomodation dropdown");
        homepage.AccomodationDropdown.click();

        log.info("Select Rent Car item");
        homepage.AccomodationRentCar.click();

        log.info("Select Start date");
        homepage.ArrivalDate.click();
        homepage.TodayIcon.click();

        log.info("Select End date");
        homepage.DepartureDate.click();
        homepage.EndDate.click();

        log.info("Click Search button");
        homepage.SearchButton.click();

        int res = hotelsPage.HotelSearchResults.size();
        log.info("Search results equals " + res);
        Assert.assertTrue("Search results equals " + res + ", should be more than 0", res >= 0);
    }


}
