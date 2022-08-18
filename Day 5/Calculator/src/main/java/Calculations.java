import java.util.Scanner;

public class Calculations {
    public void calc() {
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        if (choice == 1) {
            add.addition(a,b);
        } else if (choice == 2) {
            sub.subtraction(a,b);
        } else if (choice == 3) {
            mul.multiplication(a, b);
        } else if (choice == 4) {
            div.division(a,b);
        }
    }




}





