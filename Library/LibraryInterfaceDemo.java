package Library;

public class LibraryInterfaceDemo {
    public static void main(String[] args){
        KidUsers k1 = new KidUsers();
        k1.age = 10; 
        KidUsers k2 = new KidUsers();
        k2.age = 18; 
        k1.registerAccount();
        k2.registerAccount();

        k1.bookType = "Kids";
        k2.bookType = "Fiction";

        k1.requestBook();
        k2.requestBook();

        AdultUsers a1 = new AdultUsers();
        a1.age = 5;
        AdultUsers a2 = new AdultUsers();
        a2.age = 23; 
        a1.registerAccount();
        a2.registerAccount();

        a1.bookType = "Kids";
        a2.bookType = "Fiction";

        a1.requestBook();
        a2.requestBook();

    } 
    
}
