import java.util.Objects;

public class XI_StringExample {


    public static void main(String[] args) {

        // System.out.println(x);
       // Integer y=100;

        String str="100";

        String str1=new String("Value");
        str1=str1.toUpperCase();

      //  System.out.println(str1);


        Integer abc=new Integer(12);
        Integer abc1=12;


        Float value=121.f;



        // Difference between == and equals
        TEMP t=new TEMP();
      //  TEMP t2=t;

       TEMP t2=new TEMP();


      //  System.out.println(t==t2);
    //   System.out.println(abc==abc1);

//       String val1="JODHA";
//       String val2="JODHA";



       String val1=new String("Jodha");
       String val2=new String(" Jodha ");
       System.out.println("---"+val2.trim()+"----");

        //val2.length()
      //System.out.println(t.equals(t2));



       StudentX student1=new StudentX(1,"Jodha");
       StudentX student2=new StudentX(1,"Jodha");
       StudentX student3=new StudentX(3,"Mahesh");

       if(student1.equals(student2)){
           System.out.println("Both Students are Same");
       }

    }
}

class TEMP{
    int x;


    public boolean equals(TEMP t){
            if(this.x==t.x)
                return true;
            else
                return false;
    }



}

class StudentX{
    int id;
    String name;

    public StudentX(int id,String name) {
        this.id = id;
        this.name=name;
    }
    public boolean equals(StudentX student2){
        if(this.id==student2.id && this.name==student2.name){
            return true;
        }else{
            return false;
        }
    }


}