package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver d=new ChromeDriver();
        System.out.println("position : "+d.manage().window().getPosition());
        System.out.println("olculeri : "+d.manage().window().getSize());
        Thread.sleep(4000);
        d.manage().window().setPosition(new Point(15,15));
        d.manage().window().setSize(new Dimension(900,600));



d.close();
    }
}
