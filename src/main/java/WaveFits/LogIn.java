package WaveFits;


import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIn {

    WebDriver dr;
    String baseurl = "http://fits.qauber.com/#/page/login";

    @BeforeTest
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "/Users/suchismitasethi/Downloads/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
    }

    @Test
    public void login ()  {


        System.setProperty("webdriver.chrome.driver", "/Users/suchismitasethi/Downloads/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get(baseurl);

        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        dr.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("juliea.suchi@gmail.com");

        dr.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("omsairam09");


        WebElement signin = dr.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/button"));
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        signin.click();

    }
}
