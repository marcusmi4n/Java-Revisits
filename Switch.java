
import Java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int d;

            System.out.println("Enter a number:");
             d = sc.nextInt();
        
             int m = 5;

        Switch(d){
            case 1:
                x =(x + 5);
            break;
            case 2:
                x = (x + 10);
            break;
            case 3:
                x = (x + 10);
            break;
            case 4:
                x = (x + 10);
            break;
            default:
                System.out.println("Non");
        }
    }
}
