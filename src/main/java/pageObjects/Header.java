package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Header extends Footer {


    public Header(WebDriver driver) {

        super(driver);
    }

    // ***Elements - Utility Bar***

    //SignIn Form
    @FindBy(xpath = "//a/span[contains(text(), \"Sign in\")]")
    public WebElement SignInButton;

    @FindBy(id = "loginPopup")
    public WebElement LoginPopupWrapper;

    @FindBy(id = "signin_username")
    public WebElement EmailTextfield;

    @FindBy(id = "signin_password")
    public WebElement PasswordTextfield;

    @FindBy(id = "logInButton")
    public WebElement LoginButton;

    @FindBy(xpath = "//label[@for=\"signin_remember\"]")
    public WebElement RememberCheckbox;


    //Register Form
    @FindBy(xpath = "//a/span[contains(text(), \"Register\")]")
    public WebElement RegisterButton;

    /*
    *Register form elements goes here
    */

    //Shortlist Button
    @FindBy(xpath = "//a/span[contains(text(), \"Shortlist\")]")
    public WebElement ShortlistButton;

    //CompareButton
    @FindBy(xpath = "//a/span[contains(text(), \"Compare\")]")
    public WebElement CompareButton;

    //Live chat Button
    @FindBy(xpath = "//a/span[contains(@class, \"liveChat\")][1]")
    public WebElement LiveChatButton;

    //Language selector
    @FindBy(xpath = "//ul[@id=\"userLanguage\"]")
    public WebElement LanguageList;

    @FindBy(xpath = "//a[@class=\"languageChange\"]/span[contains(text(), \"English\")]")
    public WebElement LanguageEnglish;

    @FindBy(xpath = "//*[@id='userLanguage']/li/span[@class=\"flagIcon flag-en\"]")
    public WebElement SelectedEnglish;



    //   ***Elements - ServiceHeader***

    //Logo
    @FindBy(xpath = "//a[@id=\"logo\"]")
    public WebElement Logo;

    //CompanyInfo
    @FindBy(xpath = "//div[@class=\"bannerInfo\"]/a[contains(text(), \"About us\")]")
    public WebElement AboutUsLink;

    @FindBy(xpath = "//div[@class=\"bannerInfo\"]/a[contains(text(), \"Contact\")]")
    public WebElement ContactLink;

    @FindBy(xpath = "//div[@class=\"bannerInfo\"]/a[contains(text(), \"Guestbook\")]")
    public WebElement GuestbookLink;

    @FindBy(xpath = "//div[@class=\"bannerInfo\"]/a[contains(text(), \"Partners\")]")
    public WebElement PartnersLink;

    @FindBy(xpath = "//div[@class=\"bannerInfo\"]/a[contains(text(), \"Homeowners\")]")
    public WebElement Homeowners;

    //Tabs
    @FindBy(id = "homepageTab")
    public WebElement HomeTab;

    @FindBy(id = "privatepageTab")
    public WebElement PrivateAccomodationTab;

    @FindBy(xpath = "//a[@class=\"menuTitle\"][contains(text(), \"Hotels\")]")
    public WebElement HotelsTab;

    @FindBy(xpath = "//a[@class=\"menuTitle\"][contains(text(), \"Other services\")]")
    public WebElement OtherServicesTab;

    @FindBy(xpath = "//a[@class=\"menuTitle\"][contains(text(), \"Croatia\")]")
    public WebElement CroatiaTab;


}
