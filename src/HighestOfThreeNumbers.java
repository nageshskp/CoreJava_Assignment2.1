import java.util.Scanner;
public class HighestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int x,y,z;
	System.out.println("Enter the Three different numbers");
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the first number");
	x=in.nextInt();
	System.out.println("Enter the second number");
	y=in.nextInt();
	System.out.println("Enter the third number");
	z=in.nextInt();
	
	if(x > y && x > z)
	System.out.println("First Number is the Highest number");
	else if(y > x && y > z)
	System.out.println("Second Number is the Highest number");
	else if (z > x && z > y)
	System.out.println("Third Number is the Highest number");
	else
	System.out.println("Entered numbers are not distinct");	
	}
}
