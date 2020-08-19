package p1;

abstract class Animal
{

	Animal(int x)
	{
		System.out.println("Animal Default Constructor");
	}
	
	public void doOtherThings() {
		
	}
	
	abstract public void doEat() ; // 1000 code 
	// purpose is to override 
}