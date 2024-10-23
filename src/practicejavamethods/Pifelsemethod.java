package practicejavamethods;

public class Pifelsemethod {
	//create a check() method with an integer variable called age
static void checkage(int age)
{
	if(age<18) 
	{
		System.out.println("Access denied-you are not old enough!");
	}
	else
	{
		System.out.println("Access granted-you are old enough!");
	}
}
	public static void main(String[] args) {
		//call the checkage method and pass along an age of20
		checkage(20);

	}

}
