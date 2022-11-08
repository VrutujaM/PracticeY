package practice;

public class Jump_Statments {
	public static void main(String[] args) { 
		for (int i=1;i<=10;i++)
		{
			if (i==5)
			{
				break; //before reaching maximum limit loop will break when i==5
			}
			System.out.println(i); // output - 1 2 3 4
		}
		
	}

}
class Continue{
	public static void main(String[] args) {
		for (int i=2;i<=10;i++)
		{
			if (i==5) 
			{
				continue;
			}
			System.out.println(i);  // output 2 3 4 6 7 8 9 10 It will skip 5
		}
	}
}
class Jump_Example{
	public static void main(String[] args) {
		for (int i=2;i<=10;i++)
		{
			if (i==3 || i==5 || i==7) // if this condition is true i will not be printed and it will directly skip to next number
			{
				continue;
			}
			System.out.println(i);  // Output 2 4 6 8 9 10
		}
	}
}
