//Question 9 : Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.


import java.util.*;

class Medical
{
public static void main(String[] args)
{

float held,attend;
String med;

System.out.println("Enter the number of held classes");
Scanner deep = new Scanner(System.in);
held = deep.nextFloat();
System.out.println("Enter the number of classes attended");
attend = deep.nextFloat();

float attendance = attend/held;
System.out.println("pct = "+ attendance);
if (attendance>=0.75){
System.out.println("student is  allowed to sit in exam.");
}

else {


System.out.println("Has student any medical case yes or no?");
med = deep.next();
if(med.equals("y")){
System.out.println("student is  allowed to sit in exam.");
}
else{
System.out.println("student is not allowed to sit in exam.");
}
}
}
}