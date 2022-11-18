import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogger {

    public static void main(String[] args){
        System.out.println("hello");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.facebook.com/");

        webDriver.findElement(By.id("email")).sendKeys("evgxxtlgnp_1666691038@tfbnw.net");
        webDriver.findElement(By.name("pass")).sendKeys("6604870230985129594");
        webDriver.findElement(By.xpath("//button[contains(string(), 'Allow essential and optional cookies')]")).click();
        webDriver.findElement(By.name("login")).click();
    }
}
