package co.com.choucairEmpleos.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairSections extends PageObject {

    public static final Target SECTION_CHOUCAIR = Target.the("\n" +
            "select choucair section")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/div/h3/a"));
    public static final Target SECTION_CONVOCATORIAS = Target.the("\n" +
            "select choucair section")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/div/h3/a"));


}
