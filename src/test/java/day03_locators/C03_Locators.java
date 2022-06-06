package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
         /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
     */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        d.get("http://a.testaddressbook.com");
        WebElement sinInLink=d.findElement(By.linkText("Sign in"));
        sinInLink.click();
        WebElement emailTextBox=d.findElement(By.id("session_email"));
        WebElement passwordTextBox=d.findElement(By.name("session[password]"));
        WebElement signInButon=d.findElement(By.name("commit"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButon.click();

        WebElement actualKullaniciAdiElementi=d.findElement(By.className("navbar-text"));

        System.out.println(actualKullaniciAdiElementi.getText());

        if (actualKullaniciAdiElementi.getText().equals("testtechproed@gmail.com")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAİLED");
        }
        //“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressElement=d.findElement(By.linkText("Addresses"));
        WebElement signOutElement=d.findElement(By.linkText("Sign out"));

        if (adressElement.isDisplayed()){
            System.out.println("Adresses testi PASSED");
        }else {
            System.out.println("FAİLED");
        }

        if (signOutElement.isDisplayed()){
            System.out.println("SignOut testi PASSED");
        }else{
            System.out.println("FAİLED");
        }





        // Sayfada kac tane link oldugunu bulun.

        List<WebElement> linkListesi=d.findElements(By.tagName("a"));

        System.out.println("sayfadaki link sayisi : "+linkListesi.size());

        //Linkleri yazdiralim
        for (WebElement a:linkListesi
             ) {
            System.out.println(a.getText());

        }

        d.close();















    }
}















