import java.util.Scanner;

public class Withdraw {
    public void withdraw() {
        System.out.println("Enter the amount :");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int bal= Util.balance;
        Util util =new Util();
        Util.valid();
        int fbal = bal - amount;
        Util.balance = fbal;

        if(amount<=bal){
            System.out.println(fbal);
        }else {
            System.out.println("In sufficient amount");
        }
    }
}
