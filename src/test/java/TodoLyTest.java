import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LogIn;
import task.tasking.LogOut;
import task.tasking.ProjectTask;
import task.tasking.SignUpFree;
import task.validations.IsLoggedIn;
import ui.Logged;

public class TodoLyTest extends BaseTest {

    @Test
    public void signUpTest(){
        SignUpFree.as(webDriver,"Camilo","camilojavier71@gmail.com", "password");
        Assert.assertTrue(IsLoggedIn.isLogoutPresent(webDriver, Logged.logout));
    }
    @Test
    public void logInTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isLogoutPresent(webDriver, Logged.logout));
    }

    @Test
    public void logOutTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isLogoutPresent(webDriver, Logged.logout));
        LogOut.as(webDriver);
    }
    @Test
    public void createProjectTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isLogoutPresent(webDriver, Logged.logout));
        ProjectTask.as(webDriver,"Diplomado V5");
    }

    @Test
    public void addTodoTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isLogoutPresent(webDriver, Logged.logout));
        ProjectTask.as(webDriver,"Tarea completada");
    }
}
