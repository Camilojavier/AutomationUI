package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.Logged;

public class ProjectTask {
    public static void as(WebDriver webDriver, String name){
        Click.on(webDriver, Logged.createProjectButton);
        Enter.text(webDriver, Logged.createProjectInput, name);
        Click.on(webDriver, Logged.addProject);
    }
}
