import java.sql.SQLOutput;

public class IV_GetterSetterExample {

public static void main(String arg[]){
   Address address1=new Address();



   //Array of Objects
   int arr[]=new int[10];
   Address addressArray[]=new Address[10];



   //Default Value
    // Int = 0
    // String = null


    System.out.println(address1.City);
    System.out.println(address1.house_No);


   address1.Address1="Street 456";
   address1.house_No=12;
   address1.Address2="Near Market";
   address1.PinCode=110041;
   address1.state="Delhi";
   address1.City="New Delhi";



    address1.setHouse_No(321);
    System.out.println(address1.getHouse_No());
    System.out.println(address1.house_No);


    address1.printWholeAddress();

}

}

class Address{
     int house_No;
    String Address1;
    String Address2;
    long PinCode;
    String state;
    String City;

    public void setHouse_No(int houseNO){
        house_No=houseNO;
    }

    public int getHouse_No(){
        return house_No;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public long getPinCode() {
        return PinCode;
    }

    public void setPinCode(long pinCode) {
        PinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public void printWholeAddress(){
        System.out.println("Address : \n");
        System.out.println("HNo: "+house_No);
        System.out.println("Address: "+ getAddress1() + getAddress2());
        System.out.println("City: "+ getCity());
        System.out.println("State"+ getState());
        System.out.println("Pin code"+ getPinCode());
    }

}
