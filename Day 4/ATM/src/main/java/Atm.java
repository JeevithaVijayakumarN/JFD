import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM");
        Menu menu = new Menu();
        menu.projectmenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
    }
}
