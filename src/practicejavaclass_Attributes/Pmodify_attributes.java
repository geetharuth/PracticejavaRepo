package practicejavaclass_Attributes;

public class Pmodify_attributes {
int x;
float myfloat = 10.2f;
	public static void main(String[] args) {
		//create instance object for class
		Pmodify_attributes myobj=new Pmodify_attributes();
		myobj.x=10;//modify attribute value
		System.out.println(myobj.x);
		System.out.println("================");
		
		//override existing value
		Pmodify_attributes myobj1=new Pmodify_attributes();
		myobj1.myfloat=25.2f;//change the float value to 25.2
		System.out.println(myobj1.myfloat);
		
		
		
	}

}
