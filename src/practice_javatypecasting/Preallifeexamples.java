package practice_javatypecasting;

public class Preallifeexamples {

	public static void main(String[] args) {
		//  result is a floating-point value
		//calculate the percentage of a user's score in relation to the maximum score in a game.
		// Set the maximum possible score in the game to 500
		int maximumscore=500;
		// The actual score of the user
		int userscore=423;
	//calculate the percentage
		float myfloat=(int) maximumscore/userscore*100.0f;
		System.out.println("User's percentage is " +myfloat);
		
		
		
	}

}
