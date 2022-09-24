// Question 7. Write the code to read the price of an item in decimal form (like 75.95) and print the output in paisa(like 7595).


import java.util.*;

public class Price{

public static void main(String[] args){

Scanner ab = new Scanner(System.in);


System.out.println("Enter the number in decimal form : ");


double num = ab.nextDouble();

int num2 = (int)(num*100);


System.out.println(" output is : "+(num2));


}

}


