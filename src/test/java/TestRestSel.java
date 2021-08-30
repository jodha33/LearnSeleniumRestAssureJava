import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestRestSel {

    @Test
    public void testBoth(){
        System.out.println("I am doing Somethihg");
        RestAssured.given().baseUri("http://www.google.com").get().then().statusCode(200);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=  new ChromeDriver();
        driver.get("https://www.airbnb.co.in/");


    }
}
