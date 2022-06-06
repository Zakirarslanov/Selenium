package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElemenMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver a=new ChromeDriver();
        a.manage().window().maximize();
        a.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  1- amazon.com'a gidip arama kutusunu locate edin
        a.get("https://amazon.com");
        WebElement amazonSearchBoxElement=a.findElement(By.id("twotabsearchtextbox"));




    //  2- arama kutusunun tagName'inin input oldugunu test edin

        String expectedTagName="input";
        String actualTagName=amazonSearchBoxElement.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println( "Tag Name test is PASSED");
        }else{
            System.out.println("Tag Name test is FAİLED");
        }





    //  3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin

        String expectedNameDeger="field-keywords";
        String actualNameDegeri=amazonSearchBoxElement.getAttribute("name");

        if (expectedTagName.equals(actualTagName)){
            System.out.println("ATTRİBUTE NAME İS PASSED");
        }else{
            System.out.println("FAİLED");
        }

        System.out.println("konum : " + amazonSearchBoxElement.getLocation());
        System.out.println("webelement yuksekligi : " + amazonSearchBoxElement.getSize().height);
        a.close();
    }
}
