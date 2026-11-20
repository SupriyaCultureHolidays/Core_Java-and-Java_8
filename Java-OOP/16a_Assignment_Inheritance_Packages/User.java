public class User {
    protected String name;
    protected double phone;
    protected String email;
    protected String password;
    
    static {
        System.out.println("User String.........");
    }

    User(String name, double phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showProfile() {
        System.out.println("Name : " + this.name + "| Phone : " + this.phone + "Email : " + email);
    }

    public void login(String email, String password) {
        System.out.println("Login : " + email + "of" + this.name);
    }
}
