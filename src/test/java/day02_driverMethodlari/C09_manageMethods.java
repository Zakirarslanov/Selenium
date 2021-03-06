package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver r=new ChromeDriver();
        r.get("https://amazoon.com");
        r.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        r.get("https://amazoon.com");
         /*
          Ilerde wait konusunu daha genis olarak ele alacagiz
          Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore
          bir yuklenme suresine ihtiyac vardir
          veya bir webelementinin kullanilabilmesi icin zamana ihtiyac olabilir
          implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
          MAXIMUM sureyi belirleme olanagi tanir
         */
      r.close();
    }
}
