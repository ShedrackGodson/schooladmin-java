public class Admin extends User{
    private String password;

    // Admin constructor
    Admin(int id, String name, String roles, String password){
        this.id = id;
        this.name = name;
        this.roles = roles;
        this.password = password;
    }

    // Password Setter
    public void setPassword(String password) {
        this.password = password;
    }

    // Password Getter
    public String getPassword() {
        return this.password;
    }

    @Override
    public int getId() {
        return this.id;
    }

    // Name Getter
    public String getName() {
        return this.name;
    }

    // ID Getter
    @Override
    public int getID() {
        return this.id;
    }

    // Roles Getter
    public String getRoles() {
        return this.name + " is a " + this.roles;
    }
}