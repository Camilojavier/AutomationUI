import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.*;
import task.validations.IsLoggedIn;
import ui.HomePageUI;
import ui.Logged;
import ui.ProjectUI;

public class TodoLyTest extends BaseTest {

    @Test
    public void signUpTest(){
        SignUpFree.as(webDriver,"Camilo","camilojavier81@gmail.com", "password");
        Assert.assertTrue(IsLoggedIn.isPresent(webDriver, Logged.logout));
    }
    @Test
    public void logInTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isPresent(webDriver, Logged.logout));
    }

    @Test
    public void logOutTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isPresent(webDriver, Logged.logout));
        LogOut.as(webDriver);
        Assert.assertTrue(IsLoggedIn.isPresent(webDriver, HomePageUI.login));
    }
    @Test
    public void createProjectTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isPresent(webDriver, Logged.logout));
        ProjectTask.as(webDriver,"Diplomado V5");
        Assert.assertTrue(IsLoggedIn.isVisible(webDriver, ProjectUI.inputTodo));
    }

    @Test
    public void addTodoTest(){
        LogIn.as(webDriver,"camilojavier6@gmail.com","password");
        Assert.assertTrue(IsLoggedIn.isPresent(webDriver, Logged.logout));
        ProjectTask.as(webDriver,"Diplomado V5");
        Assert.assertTrue(IsLoggedIn.isVisible(webDriver, ProjectUI.inputTodo));
        AddToDo.as(webDriver,"Tarea completada");
        Assert.assertTrue(IsLoggedIn.isVisible(webDriver, ProjectUI.inputTodo));
    }
}
