public class Viewbalance {
    public void viewbalance() {
        Util util = new Util();

        util.valid();
        int bal = Util.balance;
        System.out.println(bal);
    }
}
