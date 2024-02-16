import java.util.Scanner;

public class Question5
{
	public static void main(String[] args)
	{
		Scanner num= new Scanner(System.in);
		
		System.out.println("What is the first number?");
		int num1 = num.nextInt();
		
		System.out.println("What is the second number?");
		int num2 = num.nextInt();
		
		System.out.println("What is the operator you wish to use?");
		String operator = num.next();
		
		if (operator.equals("+"))
		{
			int add = num1+num2;
			System.out.println(add);
		}
		
		if (operator.equals("-"))
		{
			int sub = num1-num2;
			System.out.println(sub);
		}
		
		if (operator.equals("*"))
		{
			int mul = num1*num2;
			System.out.println(mul);
		}
		
		if (operator.equals("/"))
		{
			int div = num1/num2;
			System.out.println(div);
		}
	}
}