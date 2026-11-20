public class User {
    protected String name;
    protected String phone;
    protected String email;
    protected String password;

    static {
        System.out.println("User String.........");
    }

    public User(String name, String phone, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.email=email;
        this.password=password;
    }

    protected  void showProfile() {
        System.out.println("Name : " + this.name + "| Phone : " + this.phone + " | Email : " + email);
    }

    public void login() {
        System.out.println("Login : " + this.email + " of " + this.name);
    }
}
