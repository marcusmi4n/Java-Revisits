public class greeting {
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
        
    }

    public static void greetingUser(){
        System.out.println("Hello, Stranger!" );
    }

    public static void main(String[] args) {
        greetUser("John Doe");
        greetingUser();
    }
    
}

