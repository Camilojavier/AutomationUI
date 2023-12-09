package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.Logged;

public class AddToDo {
    public static void as(WebDriver webDriver, String name){
        Enter.text(webDriver, Logged.toDoInput, name);
        Click.on(webDriver, Logged.addTodo);
    }
}
