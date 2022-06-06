package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver a=new ChromeDriver();
        a.manage().window().maximize();
        a.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  1- amazon.com'a gidip arama kutusunu locate edin
        a.get("https://amazon.com");
        WebElement amazonSearchBoxElement=a.findElement(By.id("twotabsearchtextbox"));

        amazonSearchBoxElement.sendKeys("city byke"+ Keys.ENTER);
        List<WebElement> istenenElementListesi=a.findElements(By.className("sg-col-inner"));


        WebElement result=istenenElementListesi.get(0);
        System.out.println(result.getText());

        List<WebElement> urunResimleri=a.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimleri.get(0);
       ilkUrunResmi.click();





    }

}
