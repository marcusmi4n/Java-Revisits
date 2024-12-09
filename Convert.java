import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arc;

        System.out.println("ENTER TEXT");
        arc = scanner.nextLine();

        //arc.toupperCase();{
        String UpperCase = arc.toUpperCase();
        System.out.println("UPPERCASE: " + UpperCase);
        }
    }

