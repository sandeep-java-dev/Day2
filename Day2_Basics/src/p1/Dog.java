package p1;

class Dog extends Animal
{
	
	Dog()
	{
		super(100);
		System.out.println("Dog default constructor");
		
	}
	
	public void doEat()  // from Animal
	{
		System.out.println(" Dog eats food");
	}
	
	public void runFast() // specific to Dog
	{
		
	}
	
}
