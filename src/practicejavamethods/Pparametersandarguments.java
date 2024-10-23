package practicejavamethods;

public class Pparametersandarguments {
	static void mymethod(String fname) 
	{
		System.out.println(fname+"   refsnes");
	}

	public static void main(String[] args) 
	{
		mymethod("liam");
		mymethod("jenny");
		mymethod("anja");
	}

}
