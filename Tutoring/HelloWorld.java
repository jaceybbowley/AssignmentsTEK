import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

    public static void main (String[] args) {
        ArrayList <String> myList = new ArrayList <> ();
        Scanner in = new Scanner(System.in);
        String word; 

        for (int i = 0; i < 5; i++) {
            word = in.nextLine();
            System.out.println("inserting " +  word + " at index " + i);
            word = word.toUpperCase();
            myList.add(word);

        }

        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(i + ":" + myList.get(i));
        }


    }
}