public class VI_StaticBlocks {

    public static void main(String arg[]){
        System.out.println(Example.counter);
        Example ex=new Example();
        System.out.println(Example.counter);

        System.out.println("counter"+ Example.counter);
    }
}


class Example{

    static int counter;

    Example(){
        counter=10;

    }

    //Static Block
    static {
        // Static Block will be called very first
        counter=5;
    }
}