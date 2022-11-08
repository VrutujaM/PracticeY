package practice;

public class ConditionalStatements {
	public static void main(String[] args) {
		// Conditional statments
		// If else statments
		// Eligibility for voting based on age
		int age =20;
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}   // If single statment no need to put {}
		else
		{
			System.out.println("Not Eligible for voting");
		}  // Else condition is not cumpolsory
		
		System.out.println("----------------------------");
		
		// Check wheather number is even or odd
		
		int num=5;
		if (num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		System.out.println("------------------------");
		//Find largest number among two numbers
		int a=25;
		int b=34;
		if (a>b)
		{
			System.out.println("a is the largest number");
		}
		else
		{
			System.out.println("b is the largest number");
		}

	}

}
class NestedIfElse{
	public static void main(String[] args) {
		// To print weekdays
		int a=2;
		if (a==1)
		{
			System.out.println("Monday");
		}
		else if (a==2)
		{
			System.out.println("Tuesday");
		}
		else if (a==3)
		{
			System.out.println("Wednsday");
		}
		else if (a==4)
		{
			System.out.println("Thursday");
		}
		else if (a==5)
		{
			System.out.println("Friday");
		}
		else if (a==6)
		{
			System.out.println("Saturday");
		}
		else if (a==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid input please enter value from 1 to 7 only");
		}
	}
} 
class SwitchCaseStatment
{
	public static void main(String[] args) {
		int day=3; //Tuesday  // int day =10 O/P Invalid week number
		switch (day)
		{
		case 1:System.out.println("Sunday");break;  //case "1" here one represents value for day variable
		case 2:System.out.println("Monday");break;
		case 3:System.out.println("Tuesday");break;
		case 4:System.out.println("Wednsday");break;
		case 5:System.out.println("Thursday");break;
		case 6:System.out.println("Friday");break;
		case 7:System.out.println("Saturday");break;
		default :System.out.println("Invalid week number");
		}
	}

}
