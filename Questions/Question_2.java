import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        double area;

        System.out.println("ENTER RADIUS:" );
        r = scanner.nextInt();

        area = (3.14 * (r * r));

        //System.out.println("Area :"+area);

        int a = (int) area;
        System.out.println("AREA :"+area);
        System.out.println("AREA IN INTEGER:"+a);
    }
}
