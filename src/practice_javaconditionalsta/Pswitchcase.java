package practice_javaconditionalsta;

public class Pswitchcase {

	public static void main(String[] args) {
		//The example below uses the weekday number to calculate the weekday name:
		int day=4;
		switch(day)
		{
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thur");
			break;
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
			break;
		}
		
//The default keyword specifies some code to run if there is no case match:
		int day1=4;
		switch(day1)
		{
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
			break;
		default:
			System.out.println("Looking forward to the Weekend");
		
		
		
	}
	}
}
