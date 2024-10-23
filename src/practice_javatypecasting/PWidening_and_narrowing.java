package practice_javatypecasting;

public class PWidening_and_narrowing {

	public static void main(String[] args) {
		// smaller size type to a larger size type:
int myint=20;
double mydouble=myint;
System.out.println(myint);
System.out.println(mydouble);
		
		// larger type to a smaller size type manually
double mydouble1=235.966d;
		int myint1=(int) mydouble1;
		System.out.println(mydouble1);
		System.out.println(myint1);
		
	}

}
