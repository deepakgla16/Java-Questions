//Question 6 : Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

class Main
{

public static void main(String[] args)
{
int man1,man2,man3;
Scanner age = new Scanner(System.in);

System.out.println("The age of the first person");
man1 = age.nextInt();
System.out.println("The age of the second person");
man2 = age.nextInt();
System.out.println("The age of the third person");
man3 = age.nextInt();
if(man1>man2)
{
	if(man1>man3)
		System.out.println("man1 is the oldest :"+man1);
}
else if(man2>man1)
{
	if(man2>man3)
		System.out.println("man2 is the oldest :"+man2);
}
else

	System.out.println("man3 is the oldest :"+man3);
if(man1<man2)
{
	if(man1<man3)
		System.out.println("man1 is the younger :"+man1);
}
else if(man2<man1)
{
	if(man2<man3)
		System.out.println("man2 is the younger :"+man2);
}
else if(man3<man1 && man3<man2)

	System.out.println("man3 is the younger :"+man3);

}
}


