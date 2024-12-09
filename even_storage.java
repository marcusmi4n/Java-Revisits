import java.util.ArrayList;

public class even_storage {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        
        int m;
        for (m = 2; m < 101; m += 2) {
            evenNumbers.add(m);
            System.out.println(m);
        }

    }
}
