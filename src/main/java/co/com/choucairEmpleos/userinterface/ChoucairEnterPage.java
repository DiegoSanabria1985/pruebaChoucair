package co.com.choucairEmpleos.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairEnterPage extends PageObject {


    public static final Target ENTER_PAGE = Target.the("entrar a la pantalla empleos")
            .located(By.xpath("//*[@id=\"menu-item-550\"]/a"));
}
