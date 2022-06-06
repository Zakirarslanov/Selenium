package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver a=new ChromeDriver();
        a.manage().window().maximize();
        a.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        a.get("http://a.testaddressbook.com/sign_in");

        //  b. Locate email textbox
        WebElement mailTextBox=a.findElement(By.cssSelector("#session_email"));

        //  c. Locate password textbox ve
        WebElement passwordTextBox=a.findElement(By.cssSelector("#session_password"));

        //  d. Locate signin button
        WebElement signIjnButonu=a.findElement(By.cssSelector("input[value='Sign in']"));

        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //      i. Username : testtechproed@gmail.com

        mailTextBox.sendKeys("testtechproed@gmail.com");

        //      ii. Password : Test1234!
        passwordTextBox.sendKeys("Test1234!");

        signIjnButonu.click();
        Thread.sleep(3000);
        a.close();







    }

}
