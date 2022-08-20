import java.util.*;

public class PhoneContact {
    public static void main(String[] args) {
        ArrayList<ContactDetail> contacts = new ArrayList<>();
        while (true) {
            System.out.println("1.Create Contact");
            System.out.println("2.View Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.Exit");
            System.out.println("Enter your choice :");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name :");
                    String name = sc.next();
                    System.out.println("Enter Number :");
                    long number = sc.nextInt();
                    contacts.add(new ContactDetail(contacts.size() + 1, name, number));
                    System.out.println("Contact created successfully");
                    break;
                case 2:
                    if (contacts.size() > 0) {
                        contacts.forEach((con -> System.out.println(con.getId() + " " + con.getName() + " " + con.getNumber())));
                    } else {
                        System.out.println("No Contacts Found");
                    }
                    break;
                case 3:
                    if(contacts.size()>0){
                        System.out.println("Enter id to be deleted : ");
                        int idToBeDeleted =sc.nextInt();
                        boolean exist = contacts.stream().anyMatch(find ->(find.getId()==idToBeDeleted));
                        if(exist){
                            contacts.remove(idToBeDeleted-1);
                            System.out.println("Deleted");
                        }else {
                            System.out.println("Id not found!!");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}
