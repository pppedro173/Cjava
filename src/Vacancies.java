import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Vacancies {
        public static void main(String[] args){
            WebDriver webDriver = new ChromeDriver();

            webDriver.get("https://www.miniclip.com/careers/vacancies");

            List<WebElement> allLinks = webDriver.findElements(By.tagName("a"));

            for(WebElement link:allLinks){
                if(link.getAttribute("href") != null){
                    if(link.getAttribute("href").contains("vacancies")) {
                        if (!link.getText().contains("Careers")) {
                            System.out.println(link.getText());
                        }
                    }
                }
            }
            webDriver.quit();
        }
    }
