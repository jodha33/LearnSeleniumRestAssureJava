public class VI_StaticExample {

    public static void main(String arg[]){


//        Circle cicle1 = new Circle(3.142,10);
//        cicle1.calculateCircleArea();
//        System.out.println(cicle1.radius);
//       // cicle1.print();
//
//        Circle cicle2 = new Circle(3.142,5);
//        System.out.println(cicle2.radius);
//        cicle2.calculateCircleArea();
//        //cicle2.print();

            //Static : We can call or set a variable without creating object

        Circle.pie=5.0;
        System.out.println(Circle.pie);

        Circle cicle1 = new Circle(10);
        cicle1.calculateCircleArea();
       // cicle1.pie=6.0;
        System.out.println(cicle1.pie);
       // cicle1.print();

        //After Changing value of pie
        Circle.pie=10.0;

        Circle cicle2 = new Circle(5);
        Circle cicle3=new Circle(9);
      //  cicle2.pie=8.0;
        System.out.println(cicle2.pie);
        Circle.pie=12;
        System.out.println(cicle1.pie);
        System.out.println(cicle3.pie);
       // cicle2.calculateCircleArea();
        //cicle2.print();

        // Sharing varible : across object, its value is common across all the objects, any change in its value will reflect in all the objects

        System.out.println("-------------------------");

        Car.PrintCarDetails();

        Car car1=new Car("HOnda","1.0");
        Car.PrintCarDetails();

        Car car2=new Car("Hyundai","1.0");
        Car.PrintCarDetails();

        Car car3=new Car("Hyundai","1.0");
        Car.PrintCarDetails();

    }

}


class Circle{
     static double pie=3.142;
    double radius;
    double area;
    Circle(double radius){
        this.radius=radius;
    }

    public void calculateCircleArea(){
        // pie * r * r
        area=pie*radius*radius;
    }

    public void print(){
        System.out.println("Area of Circle: "+area);
    }
}



class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static void PrintCarDetails(){
        // Non Static variable cannot be used inside Static Method
        System.out.println("Number of Cars"+ numberOfCars);
    }

    // getters and setters
}