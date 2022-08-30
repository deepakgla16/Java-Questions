import java.util.Scanner;
public class area{
	public static void main(String[] args){
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter the radius of a circle: ");
	Float r = Sc.nextFloat();
	double re = (float)((3.14)*(r*r));
	System.out.println("area = "+re);
		

}

}
