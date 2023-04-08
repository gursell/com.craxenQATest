package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;
import utilities.UserReader;

public class PageUserLogin {

    public PageUserLogin(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //https://test.craxen.com/login/
    @FindBy (xpath = "//input[@id=':r0:']")
    public WebElement fieldEmail;

    //https://test.craxen.com/login/
    @FindBy (xpath = "//button[text()='GİRİŞ YAP']")
    public WebElement buttonGIRISYAP;

    //https://test.craxen.com/login/GİRİŞ YAP.click
    @FindBy (id = "auth-login-v2-password")
    public WebElement fieldPassword;

    //https://test.craxen.com/login/
    @FindBy (xpath = "//button[text()='GİRİŞ']")
    public WebElement buttonGIRIS;

    public void login(String userKey, String passwordKey)  {
        // String loginURL = URLReader.getUrl("loginUrl");
        ReusableMethods.wait(1);
        fieldEmail.sendKeys(UserReader.getUser(userKey));
        buttonGIRISYAP.click();
        fieldPassword.sendKeys(UserReader.getPassword(passwordKey));
        buttonGIRIS.click();
        ReusableMethods.wait(1);
    }

    //login/home
    //@FindBy (xpath = "//div[@data-id='PHM\B']")
    //public WebElement rowIstatistikler_PHM\B;

    //login/home/PNL
    @FindBy (xpath = "//h6[normalize-space()='$60,423.41']")
    public WebElement labelHomePNL;

    //login/home/BrokerToplamTakım
    @FindBy (xpath = "//h6[normalize-space()='8']")
    public WebElement labelHomeBrokerTakim;

    //login/home/BrokerEnIyiOperator
    @FindBy (xpath = "//span[contains(@class,'MuiTypography-root MuiTypography-caption css-a32veu')]")
    public WebElement labelHomeBrokerEnIyiOperator;

    //login/home/ToplamOperator
    @FindBy (xpath = "//h6[normalize-space()='167']")
    public WebElement labelToplamOperator;

    //login/home/ToplamOperator
    @FindBy (xpath = "//p[contains(@class,'MuiTypography-root MuiTypography-body2 css-zgpen7')]")
    public WebElement labelToplamMusteriyeDonenler;
}


