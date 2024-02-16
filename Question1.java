import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {	
		Scanner myObj = new Scanner(System.in);  
		System.out.println("Enter your Results");
		double y = myObj.nextDouble();
		 
		System.out.println("Enter your Results");
		double x = myObj.nextDouble();
		
		double sum = x+y;
		System.out.println(sum);
	}
}