import java.util.Scanner;

public class Switch_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int d;

            System.out.println("Enter a number:");
            int d = sc.nextInt();
        
             int m = 5;

        Switch(d){

            case 1:
                m =(m + 5);
            break;
            case 2:
                m = (m + 10);
            break;
            case 3:
                m = (m + 10);
            break;
            case 4:
                m = (m + 10);
            break;
            default:
                System.out.println("Non");
        }
    }
}
