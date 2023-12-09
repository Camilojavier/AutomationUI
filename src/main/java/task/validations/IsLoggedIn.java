package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsLoggedIn {
    public static boolean isLogoutPresent(WebDriver webDriver, By location){
        return WaitUntilElement.isPresent(webDriver,location);
    }
}
