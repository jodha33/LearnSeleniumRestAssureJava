public class IX_AbstractExample {


    public static void main(String[] args) {
       //NOt Allowed to created Object of Abstract class
     //   SocialSite abstractObject=new SocialSite();

    }
}


// Abstract-- Incomplete Class

// Design Level
abstract class SocialSite{
         private String userID;
         private String password;

         abstract void doLogin(String userID,String password);
         abstract void signup(String userID,String password);
}

abstract class News extends SocialSite{
    private String userID;
    private String password;

    abstract void doLogin(String userID,String password);
    abstract void signup(String userID,String password);
}

//Implementation Level
class Facebook extends SocialSite{


    public void doLogin(String userID, String password){

    }
    public void signup(String userID, String password){

    }

}

class Twitter extends SocialSite{
    public void doLogin(String userID, String password){

    }
    public void signup(String userID, String password){

    }

}


// Interface
