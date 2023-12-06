public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        name = name;
        email = email;
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
}