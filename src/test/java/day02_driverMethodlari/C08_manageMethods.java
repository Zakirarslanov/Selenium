package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver p=new ChromeDriver();

        p.manage().window().maximize();
        System.out.println("Maximize konum : "+p.manage().window().getPosition());
        System.out.println("Maximize boyut : "+p.manage().window().getSize());

        Thread.sleep(3000);
        p.manage().window().fullscreen();
        System.out.println("Fullscreen konum : "+p.manage().window().getPosition());
        System.out.println("Fullscreen boyut : "+p.manage().window().getSize());


    }
}
