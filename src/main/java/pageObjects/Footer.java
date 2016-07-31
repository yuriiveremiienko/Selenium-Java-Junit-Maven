package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Footer {

    public Footer(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    // ***Elements - ServiceFooter***

    //Wrapper
    @FindBy (id = "serviceFooter")
    public WebElement ServiceFooterWrapper;

    //Footer Payment
    @FindBy (css = ".footerPayment")
    public WebElement FooterPaymentWrapper;

    /*
    *Other service footer elements goes here
    */


    // ***Elements - BottomFooter***

    //Wrapper
    @FindBy (id = "footerBottomWrap")
    public WebElement BottomFooterWrapper;

    //Terms and conditions
    @FindBy(xpath = "//li/a[contains(text(), \"Website Terms and Conditions\")]")
    public WebElement TermsAndConditionsLink;

    /*
    *Other bottom footer elements goes here
    */

}
