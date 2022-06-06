package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        driver.manage().window().fullscreen();

        System.out.println(driver.manage().window().getSize());

        System.out.println("actual title "+driver.getTitle());
        System.out.println("actuel url "+driver.getCurrentUrl());



    }
}
