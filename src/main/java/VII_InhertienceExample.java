public class VII_InhertienceExample {

    public static void main(String[] args) {
           /* PhysicTeacher physicTeacher=new PhysicTeacher();
            physicTeacher.id=100;
            physicTeacher.salary=1231231;
            physicTeacher.subjectArea="Physics";
            physicTeacher.courses="BSC";*/
            //physicTeacher.print();

            MorningShiftTeacher morningShiftTeacher=new MorningShiftTeacher();


           // morningShiftTeacher.print();

        // When
          // morningShiftTeacher.calculateSalary();


    }
}


class Teacher{
    int id;
    long salary;

    Teacher(){
        super();
        System.out.println("Teacher Construtor");
    }

    //Method Over Riding-- Child Clasess wil have method with same name, type and parameter
    public void print(){
        System.out.println("Teacher Class");
    }

    //Method over Loading -- two or more method inside same class would be of same name but type and pareament is different
    public void print(int x){

    }
}

class PhysicTeacher extends Teacher{
    String subjectArea;
    String courses;

    PhysicTeacher(){
        System.out.println("Physics Construtor");
    }

    public void print(){
        System.out.println("Physic Teacher");
    }

    public void calculateSalary(){
        // Calaucate - code for Salary

        //When you have same variable or method type present in parent as well as child and you want to call Parent variable or method from the child
       super.print();
    }
}

class MorningShiftTeacher extends PhysicTeacher{
  int shift;

    MorningShiftTeacher(){
        System.out.println("MorningShiftTeacher  Construtor");
    }

    public void print(){
        System.out.println("Morning Shift Teacher");
    }
}

