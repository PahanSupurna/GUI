import java.util.Scanner;

public class Question3
{
	public static void main(String[] args)
	{
		Scanner markinput = new Scanner(System.in);
	
		System.out.println("Enter your CW marks ");
		int cw = markinput.nextInt();
		
		System.out.println("Enter your ICT marks ");
		int ict = markinput.nextInt();
		
		if (cw > 30 && ict > 30)
		{
			if (cw + ict >=40)
			{
				int last = (cw + ict)/2;
				System.out.println("Your final mark is "+last);
			}
			else
			{
				System.out.println("Fail");
			}
		}
		else
		{
			System.out.println("Fail");
		}
	}	
}