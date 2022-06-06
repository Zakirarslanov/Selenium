package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver s=new ChromeDriver();
        s.manage().window().maximize();

        s.navigate().to("https://www.amazon.com");
        Thread.sleep(4000);

        s.navigate().to("https://www.facebook.com");
        Thread.sleep(4000);
        s.navigate().back();
        Thread.sleep(4000);
        s.navigate().forward();
        Thread.sleep(4000);
        s.navigate().refresh();
        Thread.sleep(4000);
        s.close();



    }
}
