//Questin 2 : Take two int values from user and print greatest among them.

import java.util.Scanner;

class user
{
public static void main(String[] args)
{
int num1,num2;
System.out.println("Enter the first number");
Scanner a = new Scanner(System.in);
num1 = a.nextInt();
System.out.println("Enter the second number");
num2 = a.nextInt();

if(num1>num2)
{
System.out.println("num1 is the greatest number :"+num1);
}
else
{

System.out.println("num2 is the greatest number :"+num2);
}
}

}


