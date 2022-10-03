package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techproeducation.com");
        driver.close();

         /*
         İleride wait konusunu daha geniş olarak ele alacağız
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre bir
        yükleme süresine ihtiyaç vardır veya bir webelementin kullanılabilmesi için zaman ihtiyaç olabilir.
        implicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        MAXIMUM sureyi belirleme olanağı tanir
         */











    }
}
