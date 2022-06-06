package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        // amazon sitesine gidip Kaynek kodlarinda "trigger" yazdigini test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver a=new ChromeDriver();
        a.manage().window().maximize();
        a.get("https://www.amazon.com");
       String sayfaKaynaklari= a.getPageSource();
       String arananKelime="trigger";

       if (sayfaKaynaklari.contains(arananKelime)){
           System.out.println("Kaynak testi PASSED");
       }else{
           System.out.println("Kaynak kodlari "+arananKelime+ " kelimesi yok. Test FAILED");
       }
    }
}
