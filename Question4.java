import java.util.Scanner;

public class Question4
{
	public static void main(String[] args)
	{
		Scanner markint = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		int mark = markint.nextInt();
		
		if (mark<=100 && mark>=40)
		{
			if (mark>70)
			{
				System.out.println("1st Class Honours");
			}
			
			else if(mark>60)
			{
				System.out.println("2nd Class Honours Upper Division");
			}
			else if(mark>50)
			{
				System.out.println("2nd Class Honours Lower Division");
			}
			else
			{
				System.out.println("3rd Classs Honorus");
			}
		}
		else
		{
			System.out.println("Invalid value");
		}
	}
}