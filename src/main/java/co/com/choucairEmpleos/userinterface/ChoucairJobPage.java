package co.com.choucairEmpleos.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJobPage extends PageObject {

    public static final Target SELECT_JOB = Target.the("select course fundamentos de ingenieria de software")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li[1]/a/div[1]/h3"));

    public static final Target NAME_JOB = Target.the("select course fundamentos de ingenieria de software")
            .located(By.xpath("//*[@id=\"post-9609\"]/header/h1"));
}
