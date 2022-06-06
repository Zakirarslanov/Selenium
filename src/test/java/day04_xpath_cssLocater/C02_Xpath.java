package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {
        //<img class="s-image"
        // src="https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY218_.jpg"
        // srcset="https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY218_.jpg 1x,
        // https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY327_FMwebp_QL65_.jpg 1.5x,
        // https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY436_FMwebp_QL65_.jpg 2x,
        // https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY545_FMwebp_QL65_.jpg 2.5x,
        // https://m.media-amazon.com/images/I/61oXs1j9p8L._AC_UY654_FMwebp_QL65_.jpg 3x"
        // alt="Gesponserte Anzeige – SLANIGIRO Urban Fahrradhelm für Erwachsene,
        // verstellbares Fit-System und integriertes Rücklicht für ..."
        // data-image-index="1"
        // data-image-load=""
        // data-image-latency="s-product-image"
        // data-image-source-density="1">

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver a=new ChromeDriver();
        a.manage().window().maximize();
        a.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        a.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin

       a.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin

       WebElement deletebutonu=a.findElement(By.xpath("//button[@class='added-manually']"));

       if (deletebutonu.isDisplayed()){
           System.out.println("Delete butonu testi is PASSED");
       }else{
           System.out.println("Delete butonu testi is FAİLED");
       }

       deletebutonu.click();

       if (a.findElement(By.xpath("//h3")).isDisplayed()){
           System.out.println( "Add/Remove Elements butonu is Passed");
       }else{
           System.out.println("Add/Remove Elements butonu is FAİLED");
       }

        //4- Delete tusuna basin
        Thread.sleep(3000);

       a.findElement(By.cssSelector("button[onclick='addElement()']"));
       //deletebutonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin






    }
}
