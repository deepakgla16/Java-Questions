// Question 5. Write the code to swap two numbers without using third variable.

import java.util.Scanner;

class Swap{
public static void main(String[] args){

System.out.println("Enter the two numbers");
Scanner obj = new Scanner(System.in);
int a = obj.nextInt();
int b = obj.nextInt();

a = a+b;
b = a-b;
a = a-b;

System.out.println("After swapping the numbers are : "+ a +"  "+ b);

}

}