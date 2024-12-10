import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int m;

        System.out.println("ENTER NUMBER:");
        m = sc.nextInt();

        for (i = 1; i < 11; i++) {
            int mult = i * m;
            
            System.out.println(i + " x " + m +"  = " + mult);

        }
    }
}
