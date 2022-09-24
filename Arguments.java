// Question 9. Write the program to print sum of two numbers using command line arguments.

public class Arguments{

public static void main(String[] args){


int total = 0;

int []arr = new int[args.length];

for(int i = 0; i<arr.length; i++)
{
	arr[i] = Integer.parseInt(args[i]);
   total = total+arr[i];

}
System.out.println(total);

}

}