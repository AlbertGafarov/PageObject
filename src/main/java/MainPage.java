import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private final ChromeDriver driver;

    public MainPage(ChromeDriver driver) {
        this.driver = driver;
        System.out.println("конструктор запущен");
        this.signInButton = driver.findElement(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline mr-3']"));
    }

    //@FindBy(xpath = "//a[@class='HeaderMenu-link flex-shrink-0 no-underline mr-3']")
    private final WebElement signInButton;


    @FindBy(css = "body > div.position-relative.js-header-wrapper > header > div > div.d-flex.flex-justify-between.flex-items-center > div.d-flex.flex-items-center > a.d-inline-block.d-lg-none.f5.color-text-white.no-underline.border.color-border-tertiary.rounded-2.px-2.py-1.mr-3.mr-sm-5.js-signup-redesign-control.js-signup-redesign-target")
    private WebElement signUpButton;

    @FindBy(xpath = ".//*[@id='user[login]']")
    private WebElement userNameField;

    @FindBy(xpath = ".//*[@id='user[email]']")
    private WebElement emailField;
    @FindBy(xpath = ".//*[@id='user[password]']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[text()='Sign up for GitHub']")
    private WebElement signUpFormButton;

    public LoginPage clickSignIn(){
        this.signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton(){
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpFormButton(){
        signUpFormButton.click();
        return new SignUpPage(driver);
    }

    public MainPage typeUserName(String username){
        userNameField.sendKeys(username);
        return this;
    }

    public MainPage typePassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public SignUpPage register(String username, String email, String password){
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        this.clickSignUpFormButton();
        return new SignUpPage(driver);
    }


}
