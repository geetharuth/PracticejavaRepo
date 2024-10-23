package practicejavaLoopings;

public class pForloop {

	public static void main(String[] args) {
		// this example will only print even values between 0 and 10
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
//print name for 5 times
		for(int i=1;i<=5;i++) 
		{
			System.out.println("geetha"+i);
		}
		System.out.println("increment value for one time==========");
		for(int i=1;i<=5;i+=2)
		{
			System.out.println("geetha"+i);
		}
		System.out.println("increment value for more than one time==========");
		for(int i=5;i>=1;i--)
		{
			System.out.println("geetha"+i);
		}
		System.out.println("decrement value for one time==========");
		for(int i=5;i>=1;i-=2)
		{
			System.out.println("geetha"+i);
		}
		System.out.println("decrement value for more than one time==========");
	}

}
