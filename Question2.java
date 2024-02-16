import java.util.Scanner;

public class Question2
{
	public static void main(String[] args)
	{
		Scanner ageinput = new Scanner(System.in);
		
		System.out.println("What is your age? ");
		int age = ageinput.nextInt();
		
		if (age > 1 )
		{
			if (age>=18)
			{
				System.out.println("Over 18");
			}
			else
			{
				System.out.println("Under 18");
			}
		}
		else
		{
			System.out.println("The age entered is incorrect");
		}
	}
}