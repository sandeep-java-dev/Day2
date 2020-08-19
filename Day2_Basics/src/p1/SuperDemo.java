package p1;


public class SuperDemo
{
	public static void main(String[] args) {
		
		SuperDemo obj = new SuperDemo();
		
		Animal a = new Cat(); // user choose Dog as animal to play game
		
		
		obj.doPlayGame(a);
		
		
	}
	
	public void doPlayGame(Animal a)
	{
		a.doEat();
	}
}






