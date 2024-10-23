package practice_javastring;

public class Pstringclass {

	public static void main(String[] args) {
		// collection of text
		String str="Hello";
		System.out.println(str);
		System.out.println("-------------");
		//length
		String text="Hello";
		System.out.println(text.length());;
		System.out.println("-------------");
		//toUppercase 
		String text1="hello";
		System.out.println(text1.toUpperCase());
		System.out.println("-------------");
		//toLowercase
		String text01="HELLO";
		System.out.println(text01.toLowerCase());
		System.out.println("-------------");
		//contain
		String text02="hello";
		System.out.println(text02.contains("l"));
		System.out.println("-------------");
		//starts with
		String text03="hello";
		System.out.println(text03.startsWith("h"));
		System.out.println("-------------");
		//ends with
		String text04="hello";
		System.out.println(text04.endsWith("o"));
		System.out.println("-------------");
		//equals
		String text05="hello";
		String text06="HELLO";
		System.out.println(text05.equals(text06));
		System.out.println("-------------");
		//equals ignore case
		String text07="hello";
		String text08="HELLO";
		System.out.println(text07.equalsIgnoreCase(text08));
		System.out.println("-------------");
		//concat
		String text00="hello";
		String text11="HELLO";
		System.out.println(text00.concat(text11));
		System.out.println("-------------");
		//replace
		String text22="hello";
		String text33="HELLO";
		System.out.println(text33.replace("HELLO", "WORLD"));
		System.out.println("-------------");
		//The sequence \"  inserts a double quote in a string:
		String textg="how iam i \"looking\" good";
		System.out.println(textg);
		System.out.println("-------------");
		//The sequence \'  inserts a single quote in a string:
		String textg1="how i\'am  looking good";
		System.out.println(textg1);
		System.out.println("-------------");
		//The sequence \\  inserts a single backslash in a string:	  
		String textg01="how iam i \\looking good";
		System.out.println(textg01);
		System.out.println("-------------");





















	}

}
