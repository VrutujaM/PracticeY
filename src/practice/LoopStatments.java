package practice;

public class LoopStatments {
	public static void main(String[] args) {
		/* While loop
        variable=value ; >> Initialization
        while (Condition) >> Condition
        {
            print statment ; 
            increment ;   >> Increment
         }
 If condition is true then only it will enter loop and execute set of statements depending on increment value
 Initialization ,condition and increment are key points of while loop */
		
		int a=1;
		while (a<=10)
		{
			System.out.println("Hello I am "+a);
			a++;
		}
		/* To print even numbers  */
		int b=2;
		while (b<=10)
		{
			System.out.println(b);
			b+=2;                  //b=b+2; same as b+=2,b+=3,b+=4...Short hand statments in java
		}
		
		/* To print numbers in descending order from 10 to 1 */
		int c=10;
		while (c>=1)
		{
			System.out.println(c);
			c--;
		}
		
	}
	class ForLoop
	{
		public static void main(String[] args) {
			for (int i=1;i<=10;i++)
			{
				System.out.println(i);
			}
		}
	}

}
