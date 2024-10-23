package practicejavaLoopings;

public class Pwhileloop {

	public static void main(String[] args) {
		//loop will run,over and over again,as long as a variable i is less than 5
		int i=0;
		while(i<5)
		{
			System.out.println(i);
			i++;
		}
	//print even numbers 0-20
		int j=0;
		while(j<=20)
		{
			System.out.println(j);
			j+=2;
		}
//Setting the infinite while loop by passing true to the condition
		while(true)
		{
			System.out.println("infinite while loop");
		}
	}

}
