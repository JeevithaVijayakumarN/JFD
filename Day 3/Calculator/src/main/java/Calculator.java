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
                    System.out.println(calculations.add());
                    break;
                case 2:
                    System.out.println(calculations.sub());
                    break;
                case 3:
                    System.out.println(calculations.mul());
                    break;
                case 4:
                    System.out.println(calculations.div());
                    break;
                case 5:
                    System.out.println(calculations.mod());
                    break;
            }
        } else {
            System.out.println("error");
        }


    }
}

