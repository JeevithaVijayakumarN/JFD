import java.util.ArrayList;
import java.util.Scanner;

public class Phonecontact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        main.main();
        int choice = sc.nextInt();
        ArrayList<Contactdetails> contactdetails = new ArrayList<>();
        while (true) {
            switch (choice) {

                case 1:
                    System.out.println("Enter the name");
                    String nameToAdd =sc.next();
                    System.out.println("Enter Number");
                    long number = sc.nextInt();
                    break;
                case 2:
                    System.out.println("View contact");
                    if(choice>0) {

                        System.out.println();
                    }else {
                        System.out.println("Contact not available");

                    }
                    break;
                case 3:
                    System.out.println("Delete contact");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid number");


            }
        }
    }
}
