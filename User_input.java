import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
       
        int a;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER NUMBER:");
        a = sc.nextInt();

        for(int i = 1; i <= a; i++) {

            System.out.print( i + " + " );
        }
    }
}
