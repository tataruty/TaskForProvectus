package SitePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tusova on 2/20/2017.
 */
public class Chapter1Page extends Page {

    @FindBy(xpath=".//div[2]/p[4]/a")
    public WebElement HomeLink;

    @FindBy(css=".leftdiv")
    public WebElement AssertText;

    public Chapter1Page (WebDriver driver){
        super(driver);
    }

    public StartPage GoHome(){
        HomeLink.click();
        return PageFactory.initElements(driver, SitePages.StartPage.class);
    }
/*
    public void CheckText(String text){
        isTextPresent(AssertText, text);
    }
    */
}
