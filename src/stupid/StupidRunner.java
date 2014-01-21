package stupid;

public class StupidRunner
{

	public static void main(String[] args)
	{
		Dumb harry = new Dumb(8);
		Dumber lloyd = new Dumber();
		
		System.out.println("Lets look at inheritance!");

		System.out.println("harry is a Dumb, his blerg is: " + harry.getBlerg());
		System.out.println("lloyd is a Dumber, his blerg is: " + lloyd.getBlerg());
		
		lloyd.setBlerg(45);
		
		System.out.println("harry is dumb and his blerg is: " + harry.getBlerg());
		System.out.println("lloyed is dumber and his blerg is: " + lloyd.getBlerg());
		
		
	}

}
