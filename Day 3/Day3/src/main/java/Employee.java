public class Employee {

    private String name;
    private String id;
    private String role;
    private int ph;
    private String email;

    public Employee(String name, String id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }


    public Employee() {
    }

    public Employee(String name, String id, String role, int ph, String email) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.ph = ph;
        this.email = email;
    }

    public void showEmployeeDetails(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Role :"+role);
        System.out.println("Phone :"+ph);
        System.out.println("Email :"+email);
        System.out.println(" ");
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
