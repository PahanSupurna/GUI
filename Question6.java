import java.util.Scanner;

public class Question6
{
	public static void main(String[] args)
	{
		Scanner cls = new Scanner(System.in);
		
		System.out.println("How many numbers of classes were held?");
		int held = cls.nextInt();
		
		System.out.println("Attended number of classes?");
		int attend = cls.nextInt();
		
		int  attendance = (attend*100)/held;
		
		if (attendance<75)
		{
			System.out.println("Do you have a medical cause? Y-yes or N-no");
			String medical = cls.next();
			
			if (medical.toLowerCase().equals("y"))
			{
				System.out.println("You are allowed to sit in exam.");
			}
			
			else
			{
				System.out.println("You are not allowed to sit in exam.");
			}
		}
		else
		{
			System.out.println("You are allowed to sit in exam.");
		}
	}
}