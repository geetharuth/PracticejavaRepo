package practice_javaarray;

public class Ploopthrogharray {

	public static void main(String[] args) {
		// loop throgh array
		String text[]= {"bmw","scoda","tata","benz"};
		for(int i=0;i < text.length;i++)
		{
			System.out.println(i);
		}
		//loop through array foreach loop
		String text1[]= {"bmw","scoda","tata","benz"};
		for(String each : text1 )
		{
			System.out.println(each);
		}
	}

}
