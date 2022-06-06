package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver w=new ChromeDriver();
        w.manage().window().maximize();
        w.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        w.get("https://www.amazon.com");

       // WebElement aramaKutusu = w.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu = w.findElement(By.name("field-keywords"));



        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


       // <input type="text" id="twotabsearchtextbox" value=""
        // name="field-keywords" autocomplete="off" placeholder=""
        // class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        // aria-label="Suche">




    }
}
