import java.util.Scanner;

public class Gpay {
    public static void main(String[] args) {
        System.out.println("Welcome to Gpay");
        Menu menu = new Menu();
        menu.projectmenu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Receive receiving = new Receive();
                    receiving.receive();
                    break;
                case 2:
                    Sent sending = new Sent();
                    sending.sent();
                    break;
                case 3:
                    Viewbalance viewingbalance = new Viewbalance();
                    viewingbalance.viewbalance();
                case 4:

                    System.exit(0);
                    break;

            }

        }


    }
}




