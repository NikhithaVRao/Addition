package Addition;

public class Arithmetic {

	int sum;
	int add(Controller c)
	{
		sum = c.num1 + c.num2;

		System.out.println("master");


		
		return sum;
	}
}

class Adder extends Arithmetic           
{
	
}