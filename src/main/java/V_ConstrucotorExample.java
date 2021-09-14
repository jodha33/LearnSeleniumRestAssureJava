public class V_ConstrucotorExample {
    public static void main(String arg[]){
        ABC abcObject=new ABC(100,200);
        ABC abcObject1=new ABC(50,100,"DATA");

    }



}


class ABC{
    int length=10;
    int breadth;

    //Default Constructor
            // Everytime it is called, to set the default values


    //Without Parameter
    public ABC(){
        length=10;
        breadth=10;
        System.out.println("Without Parameter Constructor");
    }


    int row;
    int colmns;
    String xpath;

    //With Parameter-Multiple
    public ABC(int newlength,int newbredth){
       // length=newlength;
      //  breadth=newbredth;
        System.out.println("With Parameter Constructor");
    }



    //With Parameter-Multiple
    public ABC(int row,int colmns,String xpath){
        this.row=row;
        this.colmns=colmns;
        this.xpath=xpath;

    }


    public boolean validateTableisInSortedOrder(){
        //code
        for(int i=0;i<row;i++){
            for(int j=0;j<colmns;j++){
              //  xpath(row, column).getText()==Sorted
            }
        }
        return true;
    }

    //Constructor initialize the value of variable while creating Objects
}