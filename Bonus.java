
/*Questin 4 : A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/


import java.util.*;

class Bonus
{
public static void main(String[] args)
{
int year,salary;
System.out.println("Enter the number of years");
Scanner sc = new Scanner(System.in);
year = sc.nextInt();
System.out.println("Enter the salary");
salary = sc.nextInt();
int amount = (salary*12)*year;

if(year>5)
{
System.out.println("After adding the bonus salary : "+(amount+((amount*5)/100)));
}
else
{
System.out.println("without bonus salary  : "+amount);
}
}
}