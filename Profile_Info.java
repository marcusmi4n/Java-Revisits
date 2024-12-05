import java.util.Scanner;

public class Profile_Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        String nm;

        System.out.println("ENTER USERNAME:");
        
        nm = sc.nextLine();

        System.out.println("Hello, " + nm + "! Your profile information has been successfully saved.");

        
    }
}
