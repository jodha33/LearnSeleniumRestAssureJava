public class BreakContinueExample {


    public static void main(String arg[]){

        int temparr[]=new int[10];
        String myStrArr[]=new String[10];


        for(int i=0;i<10;i++){
            temparr[i]=i+1;
        }

        for(int i=0;i<10;i++) {
            System.out.println(temparr[i]);
        }

        //Array List
            // arr.length  - Length of the Array


        //ID should be greater than 5, print it
                for(int i=0;i<temparr.length;i++){
                    if(temparr[i]<5){
                        continue;
                    }
                    System.out.println("Value Greater Than 5: "+temparr[i]);
                }

        //ID should be less than 5, print it
     // int, char, float, double, short, long, string, boolean;
            int i;
        for(i=9;i>=0;i--){
            if(temparr[i]>5){
                continue;
            }
            System.out.println("Value Less Than 5: "+temparr[i]);
        }


        //IDs have any value 5, then fail the test case, print message value is 5 lets not execute the code after this

        for(i=0;i< temparr.length;i++){
            if(temparr[i]==5){
                System.out.println("Value contains 5");
                break;
            }
            System.out.println("This is my index: "+temparr[i]);
        }


        // Label : Success
/*        for(int j=0;j<100;j++){

            if(driver.findElement(by.xpath("sdfsdf")).getText().Equals("Success")){
                break;
            }else if(driver.findElement(by.xpath("sdfsdf")).getText().Equals("Loading")){
                Thread.sleep(1000);
                continue;
            }
            System.out.println("Waiting for 1 sec");
        }*/

    }
}
