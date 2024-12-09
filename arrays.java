import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
    ArrayList<String> stuff = new ArrayList<>();

    stuff.add("apple");
    stuff.add("banana");
    stuff.add("orange");
    stuff.add("grape");
    stuff.add("kiwi");
        for (int i = 0; i < stuff.size(); i++) {
            System.out.println(stuff.get(i));
        }
    //System.out.println("Original list: " + stuff);
    }
}
