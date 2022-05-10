import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    HashMap<String, Integer> myMap; 


    public AddressBook() {
        myMap = new HashMap<String, Integer> ();
    }
    
    public void print() {
        System.out.println(myMap);
    }


    public void update(String name, Integer id) {
        myMap.put(name,id);

    }
    public static void main(String[] args) {
        
        AddressBook myBook = new AddressBook();  
        String name;
        Integer id; 
        String choice; 
        Scanner in = new Scanner(System.in);

        do {
            printMenu();
            choice = in.nextLine();
            if (choice.equals("print")) {
                myBook.print();

            }
            else if(choice.equals("add")) {
                System.out.print("Enter a name:");
                name = in.nextLine();
                System.out.print("Enter an ID:");
                id = in.nextInt();
                in.nextLine();
                myBook.update(name, id);
            }
        }   while(!choice.equals("quit"));
        System.out.println("goodbye");
    }

    public static void printMenu() {
        System.out.println("quit: quit the program");
        System.out.println("print: print the address book");
        System.out.println("add: add a name to the address book");

    }
}
