package Addition;

import java.util.*;
public class View {

	Scanner in = new Scanner(System.in);
	
	View(Controller c)
	{
		System.out.println("Enter num1 and num2");
		c.num1 = in.nextInt();
		c.num2 = in.nextInt();
	}
	
	void printSum(Adder a)
	{
		System.out.println("Sum = "+ a.sum);
	}
}
 