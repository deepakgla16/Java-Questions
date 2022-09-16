/* Question 8 : A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.  */


import java.util.*;

class Attendence
{
public static void main(String[] args)
{

int held,attend;
System.out.println("Enter the number of held classes");
Scanner deep = new Scanner(System.in);
held = deep.nextInt();
System.out.println("Enter the number of classes attended");
attend = deep.nextInt();

float attendence = (((float)attend/held)*100);
if (attendence>=75)
{
System.out.println("student is  allowed to sit in exam.");
}
else
{
System.out.println("student is not allowed to sit in exam.");
}
}
}