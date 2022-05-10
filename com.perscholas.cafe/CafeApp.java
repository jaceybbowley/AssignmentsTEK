package com.perscholas.cafe;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSpinnerUI;
public class CafeApp {

    public static void main(String[] args) {

        Product coffee = new Product("Coffee" , 2.99 , "Bean Juice Plain" );

        Product espresso = new Product("Espresso" , 1.99 , "Crack-like Coffee Bean Liquid");

        Product cappuccino = new Product("Cappucinno" , 4.99 , "Froaty Goodness");

        Scanner javaScan = new Scanner(System.in);

        System.out.println("Cafe App");
        System.out.println("\nWhat would you like to order?");
        System.out.println(coffee.getProductName() + " $" + coffee.getProductPrice());
        System.out.println(espresso.getProductName() + " $" + espresso.getProductPrice());
        System.out.println(cappuccino.getProductName() + " $" + cappuccino.getProductPrice());

       String productName =  javaScan.nextLine(); //read user input
       System.out.println("\nHow many would you like?");
       int productQuantity =  javaScan.nextInt(); // read user input
       switch(productName) {
            case "Coffee":
                coffee.setProductQuantity(productQuantity);
                System.out.println(coffee.getProductName() + ": " + coffee.getProductDescription());
                System.out.println(coffee.calculateProductTotal());
            break;

            case "Espresso":
                espresso.setProductQuantity(productQuantity);
                System.out.println(espresso.getProductName() + ": " + espresso.getProductDescription());
                System.out.println(espresso.calculateProductTotal());
            break;
            
            case "Cappuccino":
                cappuccino.setProductQuantity(productQuantity);
                System.out.println(cappuccino.getProductName() + ": " + cappuccino.getProductDescription());
                System.out.println(cappuccino.calculateProductTotal());
                break;
       }
      





    }
    
}
