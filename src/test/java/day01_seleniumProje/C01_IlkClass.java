package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {



    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.de");
    Thread.sleep(2000);
    driver.get("https://www.facebook.com");

    driver.close();





}
}