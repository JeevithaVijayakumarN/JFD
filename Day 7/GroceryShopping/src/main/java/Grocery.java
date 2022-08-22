public class Grocery {
    private int id;
    private String item;
    private int cost;

    public Grocery(int id, String item, int cost) {
        this.id = id;
        this.item = item;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
