import java.util.Scanner;

public class Question_5 {
    
    public static void greetUser(String user){
            System.out.println("Hello " + user + "!");
        }
    
        public static void greetUser(){
            System.out.println("Hello Stranger!");
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            //greetUser("Hey");
        String user;

        System.out.println("ENTER NAME:");
        user = sc.nextLine();

        if(user.length()>0){
            greetUser(user);
        }
        else{
            greetUser();
        }
        sc.close();
    }
}
