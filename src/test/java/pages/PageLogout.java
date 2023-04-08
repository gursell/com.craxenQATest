package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class PageLogout {

    public PageLogout() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //home/ProfileImage
    @FindBy(xpath = "//img[@alt='John Doe']")
    public WebElement imageProfileUser;

    //home/ProfileImage/Logout
    @FindBy(xpath = "//*[text()='Çıkış Yap']")
    public WebElement buttonLogout;

    public void logout() {
        imageProfileUser.click();
        buttonLogout.click();
        ReusableMethods.wait(3);

    }
}
