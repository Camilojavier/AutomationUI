package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.ProjectUI;

public class AddToDo {
    public static void as(WebDriver webDriver, String toDo){
        Enter.text(webDriver, ProjectUI.inputTodo, toDo);
        Click.on(webDriver, ProjectUI.addTodo);
    }
}
