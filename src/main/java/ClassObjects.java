public class ClassObjects {
    int id;
    String name;
    String address;
    boolean gender;
    double cgpa;

public static void main(String arg[]){

    Student Suresh=new Student();
    Student Jodha=new Student();


    Suresh.id=01;
    Suresh.name="Suresh";
    Suresh.address="sfsdfsdfs";
    Suresh.gender=true;
    Suresh.cgpa=88.97;
    Suresh.nationlaity="Indian";
    Jodha.nationlaity="sdfds";


   // String nationlaity="Indian";

   // String ="Sdfsdf";



    ClassObjects obj=new ClassObjects();


}

}


class Student{
        int id;
        String name;
        String address;
        boolean gender;
        double cgpa;
        String nationlaity;
}

class Teachers{

}

class School{
    String schoolname;
    String id;
}
class marks{
    int subject;
    int subjectid;
    int marks;
}