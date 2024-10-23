package practicejavaclass_Attributes;

public class Pmultipleobjects_Attribute {
	int x = 5;
	String fname = "John";
	  String lname = "Doe";
	  public static void main(String[] args) {
		  //multiple objects
	    Pmultipleobjects_Attribute myObj1 = new Pmultipleobjects_Attribute();  // Object 1
	    Pmultipleobjects_Attribute myObj2 = new Pmultipleobjects_Attribute();  // Object 2
	    myObj2.x = 25;
	    System.out.println(myObj1.x);  // Outputs 5
	    System.out.println(myObj2.x);  // Outputs 25

	    //multiple attributes
	    Pmultipleobjects_Attribute myObj3 = new Pmultipleobjects_Attribute(); 
	    System.out.println("name:"+myObj3.fname+"    "+myObj3.lname);
	    System.out.println(myObj3.x);
	    
	}

}
