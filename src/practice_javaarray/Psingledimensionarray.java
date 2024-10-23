package practice_javaarray;

public class Psingledimensionarray {

	public static void main(String[] args) {
		// store String type data into array variable
		String day[]= {"monday","tue","wed","thur","fri","sat","sun"};
		//print index number 2 
		System.out.println(day[2]);
		System.out.println();
		//change the array element
		day[0]="mon";
		System.out.println(day[0]);
		System.out.println();
		//array length
		System.out.println(day.length);
		System.out.println();
		//print the each position value from text
		for(String each : day)
		{
			System.out.println(each);
		}
		//store integer values into single dimension 
		int x[]=new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		//print array length
		System.out.println(x.length);
		//print each positon value from collection
		for(int each : x)
		{
			System.out.println(each);
		}
		
	}

}
