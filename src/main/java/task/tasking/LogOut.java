package task.tasking;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.Logged;

public class LogOut {
    public static void as(WebDriver webDriver){
        Click.on(webDriver, Logged.logout);
    }
}
