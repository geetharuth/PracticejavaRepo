package practicejavaclass_objects;

public class PcreateObject {
int x=5;

	public static void main(String[] args) {
		// create object
		PcreateObject myobj=new PcreateObject();
		System.out.println(myobj.x);
        //multiple objects
		PcreateObject myobj1=new PcreateObject();//object 1 
		PcreateObject myobj2=new PcreateObject();//object 2
		System.out.println(myobj1.x);
		System.out.println(myobj2.x);
	}

}
