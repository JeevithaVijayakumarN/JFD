import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM");
        Menu menu = new Menu();
        menu.projectmenu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Withdraw withdrawal = new Withdraw();
                    withdrawal.withdraw();
                    break;
                }
                case 2: {
                    Credit credits = new Credit();
                    credits.credit();
                    break;
                }
                case 3: {
                    Viewbalance viewbal = new Viewbalance();
                    viewbal.viewbalance();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
            menu.projectmenu();
        }
    }
}
