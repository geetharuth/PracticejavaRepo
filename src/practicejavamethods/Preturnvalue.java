package practicejavamethods;

public class Preturnvalue {
	static int mymethod(int x)
	{
		return 8+x;
		
	}
	//two parameters
	static int mymethod1(int x,int y)
	{
		return x+y;
		
	}
public static void main(String[] args) {
	System.out.println(mymethod(5));
	System.out.println(mymethod1(5,3));
	//store a result in a variable
	int z=mymethod1(5,3);
	System.out.println(z);
	}


}
