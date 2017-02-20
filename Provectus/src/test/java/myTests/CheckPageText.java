package myTests;

import SitePages.Chapter1Page;
import SitePages.StartPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


/**
 * Created by tusova on 2/3/2017.
 */
public class CheckPageText extends BasicTest {
    private StartPage startPage = PageFactory.initElements(getWebDriver(),SitePages.StartPage.class);
    private Chapter1Page chapter1Page;

    @Test
    public void CheckTextInChapter1() {
        chapter1Page = startPage.OpenChapter1();
        assertTrue(chapter1Page.isTextPresent(chapter1Page.AssertText, BasicTest.conf.getText()));
        chapter1Page.GoHome();
    }


}