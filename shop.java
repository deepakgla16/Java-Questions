/* Question 3 : A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/


import java.util.*;

class Shop
{
public static void main(String[] args)
{
int num;
System.out.println("Enter the number of products");

Scanner obj = new Scanner(System.in);
num = obj.nextInt();

int amount = num*100;
if (amount>1000)
{
System.out.println("After discount payable amount : "+(amount*0.9));
}
else
{
System.out.println("Without any discount payable amount : "+(amount));
}
 
}
}
