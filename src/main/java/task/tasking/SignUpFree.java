package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.SignUp;

public class SignUpFree {
    public static void as(WebDriver webDriver, String fullName, String email, String password){
        Click.on(webDriver, HomePageUI.signUpFree);
        Enter.text(webDriver, SignUp.fullName, fullName);
        Enter.text(webDriver, SignUp.email, email);
        Enter.text(webDriver,SignUp.password, password);
        Click.on(webDriver,SignUp.checkbox);
        Click.on(webDriver,SignUp.signup);
    }
}
