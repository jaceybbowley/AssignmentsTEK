package CoreBasicJava; 

//import java.text.DecimalFormat;
//import java.util.Scanner;

public class Variables {

//private static final DecimalFormat df = new DecimalFormat("0.00");

public static void main(String[] args){
//     // 1.
//    // Write a program that declares 2 integer variables,
//    // assigns an integer to each, and adds them together.
//    // Assign the sum to a variable. Print out the result.
    
int red = 5; 
int bull = 10; 
int redbull = red + bull; 
System.out.println(redbull); 


//    // 2.
//    // Write a program that declares 2 double variables,
//    // assigns a number to each, and adds them together.
//    // Assign the sum to a variable. Print out the result.

//    double c = 5; 
//    double d = 10;
//    double sumDub = c + d; 
//    System.out.println(sumDub);
   
// //    // 3. Write a program that declares an integer variable 
// //    // and a double variable, assigns numbers to each, 
// //    // and adds them together. Assign the sum to a variable. 
// //    // Print out the result. What variable type must the sum be?

//    int e = 2;
//    double f = 4; 
//    int sumThree = (int) (e + f); 
//    System.out.println(sumThree + " I made an int from casting");

//    int g = 4;
//    double h = 6; 
//    double answerSum = g + h; 
//    System.out.println(answerSum + " I made it a double bc you can't shove a double into an int");

// //    // 4. Write a program that declares 2 integer variables,
// //    //  assigns an integer to each, and divides the larger 
// //    //  number by the smaller number. Assign the result to a 
// //    //  variable. Print out the result. Now change the larger number
// //    //   to a decimal. What happens? What corrections are needed?

//    int i = 2;
//    int j = 6; 
//    int stupidQ = j / i; 
//    System.out.println(stupidQ);

//    double newName = stupidQ;
//    System.out.println((double)newName);

//    int k = 2; 
//    double l = 6.0; 
//    double stupidQu = l / k; 
//    System.out.println(stupidQu);

// //    // 5. Write a program that declares 2 double variables, 
// //    // assigns a number to each, and divides the larger by the smaller. 
// //    // Assign the result to a variable. Print out the result. 
// //    // Now, cast the result to an integer. Print out the result again.

//    double m = 5;
//    double n = 3; 
//    double ansFive = m / n; 
//    System.out.println(ansFive);

//    int ansSix = (int)ansFive;
//    System.out.println(ansSix);

// //    // 6. Write a program that declares 2 integer variables,
// //    //  x, and y, and assign 5 to x and 6 to y. Declare a variable 
// //    //  q and assign y/x to it and print q. Now, cast y to a 
// //    //  double and assign to q. Print q again.

//    int x = 5;
//    int y = 6;
//    int q = y / x; 
//    System.out.println(q);

//    double qQ = q; 
//    System.out.println(qQ);

// // //   7.  Write a program that declares a named constant and uses 
// // //    it in a calculation. Print the result.

// final double PI = 3.14; //declaring a constant 
// try (Scanner input = new Scanner(System.in)) {
//     System.out.print("Enter a number for radius: "); // prompts user
//     double radius = input.nextDouble();
//     double area = radius * radius * PI; // make a code for area
//     System.out.println("The area for the circle of radius " + radius + " is " + area);
// }

//   8.  Write a program where you create 3 variables that 
// represent products at a cafe. The products could be beverages 
// like coffee, cappuccino, espresso, green tea, etc. Assign prices 
// to each product. Create 2 more variables called subtotal and 
// totalSale and complete an “order” for 3 items of the first product,
// 4 items of the second product, and 2 items of the third product. 
// Add them all together to calculate the subtotal. 
// Create a constant called SALES_TAX and add sales tax to the 
// subtotal to obtain the totalSale amount. Be sure to format the results 
// to 2 decimal places.
//

double tea = 3.33;
double redBull = 6.66;
double fruitBowl = 5.55; 
final double salesTax = 1.25; 

double subTotal1 = tea * 3; 
double subTotal2 = redBull * 4; 
double subTotal3 = fruitBowl * 2; 

double subTotal = (subTotal1 + subTotal2 + subTotal3);
double totalSale1 = subTotal + salesTax; 
double totalSale = Math.round(totalSale1 * 100.0) / 100.0;
System.out.println("Your total is $" + totalSale);



// double tea = 3.33;
// double redBull = 6.66;
// double fruitBowl = 5.55; 
// final double salesTax = 1.25; 

// double subTotal1 = tea * 3; 
// double subTotal2 = redBull * 4; 
// double subTotal3 = fruitBowl * 2; 

// double subTotal = (subTotal1 + subTotal2 + subTotal3);
// double totalSale1 = subTotal + salesTax; 
// System.out.println("Your total is $" + (df.format(totalSale1)));

 }

}






