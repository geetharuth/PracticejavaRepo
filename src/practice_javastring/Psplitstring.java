package practice_javastring;

public class Psplitstring {

	public static void main(String[] args) {
		// Split characters into array collection dob
		String Dob="20-dec-2020";
		String Str1[]=Dob.split("-");
		System.out.println(Str1[2]);
		//split @
		String co="@hcl@tata@indico";
		String Str11[]=co.split("@");
		System.out.println(Str11[2]);
		//split text
		String text="iam so happy";
		String tx1[]=text.split("so");
		System.out.println(tx1[0]);
		
	}

}
