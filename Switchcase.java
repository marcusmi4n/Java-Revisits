import java.util.Scanner;

public class Switchcase {
    
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        
        //int d;

            System.out.println("Enter a number:");
            int d = mm.nextInt();
        
             int m = 5;

        switch(d){

            case 1:
                m =(m + 5);
                System.out.println(" "+m);
            break;
            case 2: 
                m = (m + 10);
                System.out.println(" "+m);
            break;
            case 3:
                m = (m + 10);
                System.out.println(" "+m);
            break;
            case 4:
                m = (m + 10);
                System.out.println(" "+m);
            break;
            default :
                System.out.println("Non");
            }

        mm.close();
    }
}
