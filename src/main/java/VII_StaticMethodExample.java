import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VII_StaticMethodExample {


    public static void main(String arg[]){
        System.out.println("This is from First Main Static Method");
        VII_StaticMethodExample.printSomething();
        //VII_StaticMethodExample.main(5);
    }

    public static void printSomething(){
        System.out.println("This is Second Static Method");
    }




}


class Driver{

    static int x=10;
    static float y=10;
    static WebDriver driverCustom;

    public static int getWebDriver(){
        driverCustom=new ChromeDriver();
        return 5;
    }
}


class student{
    int studentID;
    String studentName;

    student(int studentID,String studentName){
        this.studentID=studentID;
        this.studentName=studentName;
    }

}

class automationCode{
    public static void main(String[] args) {
//        RestAssured restAssured=RestAssured.baseURI("sdfsd");
//
//        student student=new student(api.id, api.Name);
//        student student1=new student(api.id, api.Name);
    }
}