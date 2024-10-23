package practicejavaLoopings;

public class Pnestedloop {

	public static void main(String[] args) {
		// outer loop
		for(int i=0;i<=2;i++)
		{
			System.out.println("outer::"+i);
			//inner loop
			for(int k=0;k<=3;k++)
			{
				System.out.println("inner::"+k);
			}
		}
	}

}
