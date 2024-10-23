package practicejavacontructors;

public class Pconstructor_parameters {
	int x;

	  public Pconstructor_parameters(int y) {
	    x = y;
	  }

	  public static void main(String[] args) {
	    Pconstructor_parameters myObj = new Pconstructor_parameters(5);
	    System.out.println(myObj.x);
	  }
}
