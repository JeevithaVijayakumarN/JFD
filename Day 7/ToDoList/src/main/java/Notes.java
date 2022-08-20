public class Notes {
    private int id;
    private String notes;

    public Notes() {
    }

    public Notes(int id, String notes) {
        this.id = id;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
