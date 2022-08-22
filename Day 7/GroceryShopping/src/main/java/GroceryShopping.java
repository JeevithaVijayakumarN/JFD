import java.util.ArrayList;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        ArrayList<Grocery> groceries = new ArrayList<>();
        while (true){
            System.out.println("Welcome !!!!");
            System.out.println("Press 1 to view Available Groceries");
            System.out.println("Press 2 to exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    groceries.add(new  Grocery(1,"Milk",25));
                    groceries.add(new Grocery(2,"Egg",5));
                    groceries.add(new Grocery(3,"Cereal",250));
                    groceries.add(new Grocery(4,"Bread",35));
                    groceries.add(new Grocery(5,"Jam",25));
                    groceries.forEach(Grocery1-> {
                        System.out.println(Grocery1.getId()+" "+Grocery1.getItem()+" Rs."+Grocery1.getCost());});
                    System.out.println("Enter Your Choice ");
                    int myChoice = sc.nextInt();
                    Grocery chooseItem = groceries.get(myChoice-1);
                    String item = chooseItem.getItem();
                    System.out.println(item);
                    System.out.println("Enter quantity needed:");
                    int quantity = sc.nextInt();
                    int totalAmount = quantity*chooseItem.getCost();
                    System.out.println("Your total amount"+totalAmount);
                    break;
                case 2:
                    System.out.println("Thank you for shopping!!!!");
                    System.exit(0);
                    break;
            }
        }
    }
}
