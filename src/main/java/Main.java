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

        String xpathInput = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        WebElement googleInput = driver.findElement(By.xpath(xpathInput));
        googleInput.sendKeys("softserve it academy\n");

        String urlSoftserve = "//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/div/cite/span";
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
