/* Question 5 : A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/



import java.util.*;

class Grade
{
public static void main(String[] args)
{
int marks;
System.out.println("Enter the marks");
Scanner ab = new Scanner(System.in);
marks = ab.nextInt();

if(marks<25)
{
System.out.println("Grade is F");
}
else if(marks<45)
{

System.out.println("Grade is E");

}
else if (marks<50)
{
System.out.println("Grade is D");

}
else if(marks<60) 
{
System.out.println("Grade is C");
}
else if (marks<80)
{
System.out.println("Grade is B");
}
else
{
System.out.println("Grade is A");


}
}

}

