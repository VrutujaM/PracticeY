package practice;

public class ControlStatments {
	public static void main(String[] args) {
		/* 
		 *  
		 * */
		/* 1.Write a java program to find number is positive or negative */
		int i=-6;
		if (i<0) {
			System.out.println("Number is Negative");
		}else if (i>=0) {
			System.out.println("Number is positive");
		}
		System.out.println("----------------------------------");
		/* 2.write a java program to find greatest of 3 numbers 5*0=0 5*1=5 5*2=10....*/
		int a=110,b=90,c=60;
		if (a>b && a>c)
		{
			System.out.println("a is gratest number ");
		}else if (b>a && b>c)
		{
			System.out.println("b is greatest number");
		}else if (c>a && c>b)
		{
			System.out.println("c is greatest number");
		}
		System.out.println("--------------------------");
		/* 3. Write a java program to display multiplication of 5 */
		int num=5;
		for (int y=0;y<=10;++y) {
			System.out.println(num*y);
		}
		System.out.println("-------------------------");
		/* 4.Write a java program to count number of digits present in the number */
		
	}
	
	

}
