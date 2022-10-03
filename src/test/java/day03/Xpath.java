package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {

    public static void main(String[] args) throws InterruptedException {

        /*
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        Add Element butonuna basin
        Delete butonu’nun gorunur oldugunu test edin
        Delete tusuna basin
        “Add/Remove Elements” yazisinin gorunur oldugunu test edin
       */


        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        // Add Element butonuna basin
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[text()='Add Element']")).click();   // xpath ile locate alma
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();

        /*
        Locate alırken sadece text kullanıcaksak //*[text()='Add Element'] bu formatt kullanılır
        Atribute kullanıcaksak //*[@onclick='addElement()'] bu format kullanılır
         */


        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@class='added-manually']"));

        if (deleteButton.isDisplayed()){
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");

        // Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();


        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        //WebElement addRemoveElement = driver.findElement(By.xpath("//h3")); // 1. yol
        WebElement addRemoveElement = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")); // 2. yol


        if (addRemoveElement.isDisplayed()){
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");

        // Sayfayi kapatiniz

        driver.close();





    }
}