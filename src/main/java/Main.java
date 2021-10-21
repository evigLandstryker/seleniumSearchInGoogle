import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String xpathSearch = "//input[@type=\"text\"]";
        WebElement googleInput = driver.findElement(By.xpath(xpathSearch));
        googleInput.sendKeys("softserve it academy\n");

        //Кнопка "Поиск" почему-то не получает ключ Enter ни в каком виде
        /*String xpathButtonSearch = "//input[@type=\"submit\"]";
        WebElement buttonSearch = driver.findElement(By.xpath(xpathButtonSearch));
        buttonSearch.sendKeys("ENTER");*/

        String urlSoftserve = "//*[@id=\"rso\"]/div[1]";
        WebElement softserve = driver.findElement(By.xpath(urlSoftserve));
        softserve.click();

        String urlCurrentPage = driver.getCurrentUrl();
        if (urlCurrentPage.contains("softserve")) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        driver.quit();
    }
}
