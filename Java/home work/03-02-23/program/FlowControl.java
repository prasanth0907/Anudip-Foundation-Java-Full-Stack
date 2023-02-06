import java.util.Scanner;
class FlowControl
{
	public static void main(String[]name)
	{
		Scanner input=new Scanner (System.in);
		System.out.print("Enter your age : ");
		int age=input.nextInt();
	if(age>8)
	{
		System.out.println("yellow baloon");
		
	}		
else
{
	System.out.print("enter ur gender:");
	String gender = input.next();
	
	if(gender.equals("boy"))
	{
		System.out.println("green");
		
	}
	else if (gender.equals("girls"))
	{
		System.out.println("red");
		
	}
	else
	{
		System.out.println("blue");
	}
}
}
}

