// Question 6. Write the code to print student data using Scanner class.

import java.util.*;
public class Student
{

		public static void main(String[] args){

System.out.println("Enter the data of student");

Scanner obj = new Scanner(System.in);
System.out.println("Enter your name");
String name = obj.nextLine();
System.out.println("Enter your rolln");
int rolln = obj.nextInt();
System.out.println("Enter your age");
int age = obj.nextInt();
System.out.println("Enter your number");
Long number = obj.nextLong();
obj.nextLine();

System.out.println("Enter your college");
String college = obj.nextLine();
System.out.println("Enter your address");
String address = obj.nextLine();


System.out.println("Name : "+name);
System.out.println("Roll number : "+rolln);
System.out.println("Age : "+age);
System.out.println("College name : "+college);
System.out.println("Address : "+address);
System.out.println("Contact number : "+number);

	}
}
