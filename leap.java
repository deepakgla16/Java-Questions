/* Question 12. Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century 
year like 2000, 1900, 2100 then it must be divisible by 400.*/


import java.util.Scanner;

class leap{
	public static void main(String[] args){
	
	Scanner sc = new Scanner (System.in);
	int y = sc.nextInt();

String s = (y%400 == 0) || (y%4==0 && y%100 !=0) ? "Leap year" : "Not a leap year";



System.out.println(s);



}
}





