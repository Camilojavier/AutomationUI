package ui;

import org.openqa.selenium.By;

public class SignUp {
    public static By fullName = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");

    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");
    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");
    public static By checkbox = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");
    public static By signup = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");
}
