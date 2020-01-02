package Addition;

public class Controller {

	int num1, num2;
	public static void main(String[] args)
	{
		
	Controller c = new Controller();
	
	View v1 = new View(c);
	
	Adder a = new Adder();
	
	a.add(c);
	v1.printSum(a);
	}
}
