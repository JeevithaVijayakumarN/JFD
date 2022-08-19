public class Contactdetails {
    private int id;
    private String Name;
    private int Number;

    public Contactdetails(int id, String name, int number) {



            this.id = id;
            Name = name;
            Number = number;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }


}
