package Library;

public interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age; 
    String bookType;
    public void registerAccount(){
        if (age < 12){
            System.out.println("You have successfully registered under a kids account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid");
        }

    }
    public void requestBook(){
        if (bookType.equals ("Kids")){
        System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }

    }

}

class AdultUsers implements LibraryUser{
    int age; 
    String bookType;
    public void registerAccount(){
        if (age >= 12){
            System.out.println("You have successfully registered under an adult user");
         } else {
            System.out.println("Sorry age must be older than 12 to register as an adult");

         }

    }
    public void requestBook(){
        if (bookType.equals ("Fiction")){
            System.out.println("Book issued successfully, please return the book within 7 days");
            } else {
                System.out.println("Oops, you are allowed to take only adult fiction books");
            }

}
}
