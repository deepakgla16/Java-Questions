/* Question 7 : Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1  */


import java.util.*;

class Value
{
public static void main(String[] args)
{
int a ;
System.out.println("Enter a number");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
System.out.println("After the absolute number is : "+(Math.abs(a)));  

}
}