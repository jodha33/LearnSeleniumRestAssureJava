public class X_InterfaceExample implements SocialSite_2,SocialSite_3{

    public void doLogin() {

    }
    public void doSignup() {

    }

    public static void main(String[] args) {

        System.out.println(SocialSite_2.username);
    }
}


interface SocialSite_2{

        // public
        // static
        // final
      String username="User1";

      public void doLogin();
      public void doSignup();

}

interface SocialSite_3{

    String username="User1";

    public void doLogin();
    public void doSignup();

}

