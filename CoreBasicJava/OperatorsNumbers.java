// public class OperatorsNumbers {

//     // 1. Decimal in binary notation: 

//  1: 0000 0001
//  8: 0000 1000
// 33: 0010 0001
// 78: 0100 1110
// 787: 0011 0001 0011
// 33,987: 1000 0100 1100 0011 
// 

// 2. Binary to decimal

// 0100: 2
// 1001: 9
// 0011 0100: 52
// 0111 0010: 144
// 0010 0001 1111: 1055 
// 0010 1100 0110 0111: 11367
// 

// 3. Write a program that declares an integer a variable x and assigns the value 2 to it 
// and prints out the binary string version of the number ( Integer.toBinaryString(x) ). 
// Now, use the left shift operator (<<) to shift by 1 and assign the result to x. 
// Before printing the results, write a comment with the predicted decimal value and binary string. 
// Now, print out x in decimal form and in binary notation. */
//         
// int x1 = 2;
// System.out.println(Integer.toBinaryString(x1));
// x1 = x1 << 1;
// System.out.println("Decimal: " + x1 + ", Binary: " + Integer.toBinaryString(x1));

// 4. Write a program that declares a variable x and assigns 150 to it and prints out the 
// binary string version of the number. Now use the right shift operator (>>) to shift by 2 
// and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be. 
// Now print the value of x and the binary string.*/

// int x2 = 150;
// System.out.println(Integer.toBinaryString(x2));
// x2 = x2 >> 2;
// System.out.println("Decimal: " + x2 + ", Binary: " + Integer.toBinaryString(x2));
//     
// 5. Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y. 
// Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y. 
// Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
// Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y. As before, 
// write a comment that indicates what you predict the values to be before printing them out.*/

// int x3 = 7;		// 7 = 0111
// int y1 = 17;	// 17 = 0001 0001
// int z1;
// z1 = x3 & y1;
// System.out.println(Integer.toBinaryString(z1));
// z1 = x3 | y1;
// System.out.println(Integer.toBinaryString(z1));

// 6.
// Write a program that declares an integer variable, assigns a number, 
// and uses a postfix increment operator to increase the value. 
// Print the value before and after the increment operator.

// 		int x4 = 5;
// 		System.out.println(x4++);
// 		System.out.println(x4);

// 	7. Write a program that demonstrates at least 3 ways to increment a 
// variable by 1 and does this multiple times. 
// Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.*/

// 		int x5 = 5;
// 		System.out.println(++x5 );
// 		System.out.println(x5 += 1);
// 		System.out.println(x5 = x5 +1 );

// 	8.
// Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. 
// Create another variable sum and assign the value of ++x added to y and print the result. 
// Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. 
// Notice what the value of sum is. The first configuration incremented x and then calculated the sum while the second 
// configuration calculated the sum and then incremented x.*/

// 		int x6 = 5;
// 		int y2 = 8;
// 		int z2 = ++x6 + y2;
// 		System.out.println(z2);
// 		x6 = 5;
// 		z2 = x6++ +y2;
// 		System.out.println(z2);
    
// }
