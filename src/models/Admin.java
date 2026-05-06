package models;

public class Admin extends Person {
    private String password;

    public Admin(String id, String name, String email, String phone, String password) {
        super(id, name, email, phone);
        this.password = password;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String getRole() { return "ADMIN"; }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // Format: ADMIN,id,name,email,phone,password
    @Override
    public String toString() {
        return "ADMIN," + super.toString() + "," + password;
    }

    public static Admin fromString(String line) {
        String[] parts = line.split(",");
        return new Admin(parts[1], parts[2], parts[3], parts[4], parts[5]);
    }
}
