public class ID {
    private String password;
    private String Username;

    public ID(String password, String Username) {
        this.password = password;
        this.Username = Username;
    }
    public String getPasswords() {
        return password;
    }
    public String getUsername(){
        return Username;
    }

    public static void main(String[] args) {
        ID me = new ID("marcus", "Mian");
        System.out.println("My username is: " + me.getUsername());
        System.out.println("My password is: " + me.getPasswords());
    }
}
