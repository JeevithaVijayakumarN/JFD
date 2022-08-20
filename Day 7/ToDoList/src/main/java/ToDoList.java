import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<Notes> notes = new ArrayList<>();

        while (true) {
            System.out.println("1.Add notes");
            System.out.println("2.View notes");
            System.out.println("3.Delete notes");
            System.out.println("4.Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter notes");
                    String newnotes = sc.next();
                    notes.add(new Notes(notes.size()+1,newnotes));
                    System.out.println("Successfully added");
                    break;
                case 2:
                    if(notes.size()>0){
                        notes.forEach((addedNotes-> System.out.println(addedNotes.getId()+addedNotes.getNotes())));
                        System.out.println("Notes added");
                    }else {
                        System.out.println("Notes not available!!");
                    }

                    break;
                case 3:
                    if (notes.size()>0){
                       int notesToBeDeletd = sc.nextInt();
                        boolean ifexist = notes.stream().anyMatch(find ->(find.getId()==notesToBeDeletd));
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
