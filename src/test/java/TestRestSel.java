import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestRestSel {
    int student[] ;


    TestRestSel(){
        student=new int[10];
        student[0]=500;
    }

    @Test
    public void testBoth(){
        System.out.println("I am doing Somethihg");
        RestAssured.given().baseUri("http://www.google.com").get().then().statusCode(200);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=  new ChromeDriver();
        driver.get("https://www.airbnb.co.in/");

        student[0]=10;

    }

    @Test
    public void dosomething(){

        student [0]=100;
    }

    @Test
    public void print(){


        System.out.println(student[0]);
    }
}
