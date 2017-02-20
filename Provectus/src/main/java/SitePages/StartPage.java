package SitePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by tusova on 2/20/2017.
 */
public class StartPage extends Page {

    @FindBy(css="a[href*='chapter1']")
    public WebElement Chapter1Link;

    public StartPage (WebDriver driver){
        super(driver);
    }

    public Chapter1Page OpenChapter1(){
        Chapter1Link.click();
        return PageFactory.initElements(driver, SitePages.Chapter1Page.class);
    }
}

