package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LandingPage;

public class TestPlan {

    private final WebDriver driver = new ChromeDriver();
    LandingPage start = new LandingPage(driver);


    @BeforeTest
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);

    }

    @Test(testName = "First Test")
    public void firstTest(){

        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        start.searchProduct();

    }

    @AfterTest
    public void endTest(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();



    }

}