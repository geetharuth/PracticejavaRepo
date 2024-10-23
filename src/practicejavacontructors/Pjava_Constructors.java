package practicejavacontructors;

public class Pjava_Constructors {
int x; //create a class attribute

//Create a class constructor for the Main class
public Pjava_Constructors() {
	x=5;// Set the initial value for the class attribute x

}
	public static void main(String[] args) {
Pjava_Constructors   myObj = new Pjava_Constructors(); // Create an object of class Main (This will call the constructor)
	    System.out.println(myObj.x); // Print the value of x
	 
	    
	}

}
