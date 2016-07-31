package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends Header {

    public Homepage(WebDriver driver) {
        super(driver);
    }


    // ***Homepage Search***

    //Wrapper
    @FindBy(css = ".homepageSearchWrap")
    public WebElement HomepageSearchWrapper;

    //Accomodation dropdown
    @FindBy(id = "accTypeSelected")
    public WebElement AccomodationDropdown;

    //Private Accomodation item
    @FindBy(xpath = "//ul/li[contains(@class, \"private\")]")
    public WebElement AccomodationPrivate;

    //Accomodation item Hotels
    @FindBy(css = ".hotel")
    public WebElement AccomodationHotels;

    //Accomodation item Vacation Villages
    @FindBy(xpath = "//ul/li[contains(@class, \"resort\")]")
    public WebElement AccomodationVacationVillages;

    //Accomodation item Yacht charter
    @FindBy(xpath = "//ul/li[contains(@class, \"charter\")]")
    public WebElement AccomodationYachtCharter;


    //Accomodation item rent a car
    @FindBy(xpath = "//ul/li[contains(@class, \"rentacar\")]")
    public WebElement AccomodationRentCar;


    //Arrival&departure dates
    @FindBy(xpath = "//div/input[contains(@class, \"searchInputFrom\")]")
    public WebElement ArrivalDate;

    @FindBy(xpath = "//div/input[contains(@class, \"searchInputTo\")]")
    public WebElement DepartureDate;

    @FindBy(xpath = "//td[@data-handler=\"selectDay\"][2]")
    public WebElement TodayIcon;

    @FindBy(xpath = "//div[@class=\"ui-datepicker-group ui-datepicker-group-last\"]//tr[last()]/td[1][@data-handler=\"selectDay\"]")
    public WebElement EndDate;

    //SearchButton
    @FindBy(xpath = "//input[@value=\"Search\"]")
    public WebElement SearchButton;

    private void waitForVisibility(WebDriver driver, WebElement element) throws Error{
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(element));
    }


    // ***Carousel***

    //Wrapper
    @FindBy(id = "carouselWrap")
    public WebElement HomepageCarouselWrapper;

    /*
    *Other Carousel elements goes here
    */


    // ***BoxWrap***
    // ***Left Content***
    // ***Sidebar Content***
    // ...


}
