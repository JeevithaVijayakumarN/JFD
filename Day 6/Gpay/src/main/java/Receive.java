import java.util.Scanner;

public class Receive {
    public void receive() {
        System.out.println("Receive  amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int bal = Util.balance;
        Util util = new Util();
        util.valid();
        int newbal = bal + amount;
        if (amount <= bal) {
            System.out.println(newbal);
        }
    }
}
