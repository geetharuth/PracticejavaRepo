package practice_javaarray;

public class Pobjectarrysingledimensionarray {

	public static void main(String[] args) {
		// store different datatype
		Object x[]=new Object[5];
		 x[0]="admin1";
		 x[1]="12345";
		 x[2]="true";
		 x[3]="93.2";
		 System.out.println(x[3]);
		 for(Object each : x)
		 {
			 System.out.println(each); 
		 }
		}

	
}
