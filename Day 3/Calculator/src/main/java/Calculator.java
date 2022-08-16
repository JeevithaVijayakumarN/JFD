import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Menu myObj = new Menu();
        myObj.displayMenu();
        Calculations calculations = new Calculations();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice < 0 & choice >= 5) {
            switch (choice) {
                case 1:
                    System.out.println(Calculations.add());
                    break;
                case 2:
                    System.out.println(Calculations.sub());
                    break;
                case 3:
                    System.out.println(Calculations.mul());
                    break;
                case 4:
                    System.out.println(Calculations.div());
                    break;
                case 5:
                    System.out.println(Calculations.mod());
                    break;
            }
        } else {
            System.out.println("error");
        }


    }
}

