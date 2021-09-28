public class VIII_AccessSpecifier {

        int counter=0;

       public void print(){
           counter=counter+10;
       }

}


class temp{
    public static void main(String arg[]){
        VIII_AccessSpecifier obj=new VIII_AccessSpecifier();
        obj.counter=10;

       //obj.counter="23213";
    }
}


//Access Specifier Keywords:

//  1. Public : Access Variable/Methods from anywhere
//  2. Private : Access of Variables/Method only inside Class
//  3. Protected : Inheritence
//  4. Default : Access Variable/Methods only from same package
