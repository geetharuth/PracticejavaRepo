package practice_javaarray;

import java.util.ArrayList;

public class Parraylistmethods {

	public static void main(String[] args) {
		// store collection of cars into arraylist class
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("tata");
		cars.add("bmw");
		cars.add("suziki");
		cars.add("kia");
		cars.add("benz");
		cars.add("indico");
		cars.add("hyndai");
		//print array collection number
		System.out.println(cars.size());
		//print specific position values from collection
		System.out.println(cars.get(2));
		//print 0 to 5 values from collection
		for(int i=0;i<=5;i++)
		{
			System.out.println(cars.get(i));
			
		}
		System.out.println(".......................");
		//print all values from collection
		for(int j=0;j<cars.size();j++)
		{
			System.out.println(cars.get(j));
		}
	}

}
