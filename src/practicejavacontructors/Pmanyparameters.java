package practicejavacontructors;

public class Pmanyparameters {
	 int modelYear;
	  String modelName;

	  public Pmanyparameters(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
	    Pmanyparameters myCar = new Pmanyparameters(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }

}
