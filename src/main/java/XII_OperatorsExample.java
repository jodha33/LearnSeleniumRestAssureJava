public class XII_OperatorsExample {

    public static void main(String[] args) {

        //Operatrors   + - = /, && ||  ++

        //Arithmatic OPeration  + - / * %
        System.out.println(4+5);

        int i=10;
        //Relational Operators < > <= >= == !=

        if(i!=98){
            System.out.println("Inside IF");
        }
        //Assignment Operator =
        System.out.println(i=10);

        // Logical Operator  AND-&&    OR-||
        if(i>50 || i<1000){
            System.out.println("Condition True");
        }


        //Unary Operator ++ --
        // i++;
        //  i--;
        // i=i++;

        for(int temp=60;temp>0 && temp<600;++temp){
            System.out.println(temp);
        }

//        int y=++i;


        int y=10;
        y=+y;  // y=y

        //   System.out.println(i);
        System.out.println("Printing from Here");
        System.out.println();

        boolean flag=true;

        if(!flag){
            System.out.println("Using Flag");
        }


        // int float double long short byte boolean char
        // Integer, Float, Double, Long, Short, Byte, Boolean, Char, String

        int x=19;
        x++;
    }
}
