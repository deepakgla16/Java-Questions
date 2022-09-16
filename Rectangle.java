//Question 1 :Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

class Rectangle
{
public static void main(String[] args)
{
int breadth, length;
Scanner dig = new Scanner(System.in);
System.out.println("Enter the breadth");
breadth = dig.nextInt();
System.out.println("Enter the length");
length = dig.nextInt();

if(length == breadth)
{
System.out.println("It is a square");
}
else
{
System.out.println("It is not a square");
}




}

}
