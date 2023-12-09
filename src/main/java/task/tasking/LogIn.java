package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoginUI;

public class LogIn {
    public static void as(WebDriver webDriver, String email, String password){
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, password);
        Click.on(webDriver, LoginUI.login);
    }
}
