public class ContactDetail {
    private int id;
    private String Name;
    private long Number;

    public ContactDetail() {

    }

    public ContactDetail(int id, String name, long number) {
        this.id = id;
        this.Name = name;
        this.Number = number;
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

    public long getNumber() {
        return Number;
    }

    public void setNumber(long number) {
        Number = number;
    }

}
