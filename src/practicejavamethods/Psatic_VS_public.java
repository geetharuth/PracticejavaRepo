package practicejavamethods;

public class Psatic_VS_public {
//static method
	static void mystaticmethod()
	{
		System.out.println("Static methods can be called without creating objects");
	}
	//public method
	public void mypublicmethod()
	{
		System.out.println("Public methods must be called without creating objects");
	}
	//main method
	public static void main(String[] args) {
		mystaticmethod();//Call the static method
		Psatic_VS_public myobj=new Psatic_VS_public();// Create an object of Main
	    myobj.mypublicmethod();// Call the public method on the object/ TODO Auto-generated method stub

	}

}
