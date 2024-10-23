package practicejavaLoopings;

public class Preallifeexamples1 {

	public static void main(String[] args) {
		// print "yatzy" if the dice number is 6;
		int dice = 1;

		while (dice <= 6) {
		  if (dice < 6) {
		    System.out.println("No Yatzy.");
		  } else {
		    System.out.println("Yatzy!");
		  }
		  dice = dice + 1;
}
	}
}
