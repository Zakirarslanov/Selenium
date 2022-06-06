package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElemenst {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver yol=new ChromeDriver();
        yol.manage().window().maximize();

        yol.get("https://www.amazon.com");
        yol.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        List<WebElement> linkListesi=yol.findElements(By.tagName("a"));

        System.out.println("link sayisi : "+linkListesi.size());

        yol.close();


    }
}
