import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Demo1_StaticAndObjects {



    @Test(priority=1)
    public void ZpenWebsite(){
        Browser browser=new Browser("Chrome");
        browser.getDriver().get("https://www.airbnb.co.in/");




    }

    @Test(priority=2)
    public void ApenWebsite1(){
        RestAssured.given()
                .baseUri("http://www.google.com").get().then().statusCode(200);

    }


    @Test(priority=3)
    public void ApenWebsite3(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.airbnb.co.in/");
        String city[]=new String[10];
        String fromDate[];
        String toDate[];
        String Guest[];

        if(true) {
           city[0]="Mumbai";
        }



        long pinCode[];
        boolean flexibility[];
        float currency[];



        for(int i=0;i< getCity().length;i++){
            city=getCity();
//            fromDate=getDate();
//            toDate=getToDate();
//            Guest=getGuest();
            flexibility=getFlexiblity();
            driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).sendKeys(city[i]);

            if(flexibility[i]==true){
                // Click on I m flixible
            }else{
                // click on DAte
            }
            //


        }

//        location="";
//
//        if(location.length()>5){
//            location="Delhi";
//        }else{
//            location="Mumbai";
//        }



    }

    private boolean[] getFlexiblity() {
        System.out.println();
        boolean[] flexibiliy={true, false, false, true};
        return flexibiliy;
    }

    //

//    0 1 2 3 4 5
//
//    0 - Mumbai
//    1 - Delhi
//    2-  Kolkata
//    3 - Chennai
//    4 -
//    5- Amritsar
//    6- Jaipur

    private String[] getCity() {

        String[]  city={"Mumbai","Delhi","Kolkata","Chennai"};
        city[5]="Amritsar";
        city[6]="Jaipur";
        return city;
    }


}


class Browser{
    private  WebDriver driver;

    // Not have Return Type
    // Name of the constructor and class will be same
    public Browser(String browserType){
        if(browserType.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browserType.equals("Firefox")){
            driver=new FirefoxDriver();
        }else{
            driver=new InternetExplorerDriver();
        }

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setBrowser(String browserType){
        if(browserType.equals("Chrome")){
            driver=new ChromeDriver();
        }else if(browserType.equals("Firefox")){
            driver=new FirefoxDriver();
        }else{
            driver=new InternetExplorerDriver();
        }

    }

    public void click(){
        driver.findElement(By.xpath("")).click();
       // return this;
    }

    public Browser scroll(){
        driver.findElement(By.xpath("")).click();
        return this;
    }
}
