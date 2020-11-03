package co.com.choucairEmpleos.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairJobs extends PageObject {

    public static final Target KEYWORDS = Target.the("\n" +
            "enter keywords")
            .located(By.id("search_keywords"));
    public static final Target LOCATION = Target.the("\n" +
            "enter keywords")
            .located(By.id("search_location"));
    public static final Target SEARCH = Target.the("\n" +
            "enter keywords")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input"));


}
