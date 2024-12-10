import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("ENTER AGE:");
        age = sc.nextInt();

        if(age > 17){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
