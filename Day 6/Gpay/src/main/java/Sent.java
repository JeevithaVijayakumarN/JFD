import java.util.Scanner;

public class Sent {
    public void sent() {
        System.out.println("Sending amount:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int bal = Util.balance;
        Util util = new Util();
        util.valid();
        int newbal = bal - amount;
        if (amount <= bal) {
            System.out.println(newbal);
        } else {
            System.out.println("In sufficient amount");
        }


    }

}
