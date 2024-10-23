package practicejavamethods;

public class Pmethodoverloading {
	//overload with multiple methods
	static int mymethodint(int x,int y)
	{
		return x+y;
	}
	static double mymethoddouble(double x,double y)
	{
		return x+y;
		
	}
	//overload with single method
		static int mymethod(int x,int y)
		{
			return x+y;
		}
		static double mymethod(double x,double y)
		{
			return x+y;
			
		}

	public static void main(String[] args) {
		//multiple method
		System.out.println("int:"+mymethodint(8,5));
		double mynum1=mymethoddouble(5.2,3.5);
		System.out.println("double:"+mynum1);
//single method
		int myNum01 = mymethod(8, 5);
		  double myNum02 = mymethod(5.2,3.5);
		  System.out.println("int: " + myNum01);
		  System.out.println("double: " + myNum02);
	}

}
