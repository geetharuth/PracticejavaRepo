package practice_javaarray;

public class Pobjectarraymultidimensionarray {

	public static void main(String[] args) {
		//store login data into two dimension
		Object login[][]=new Object[4][2];
		login[0][0]="admin1";
		login[0][1]="pass1";
		login[1][0]="admin2";
		login[1][1]="pass2";
		login[2][0]="admin3";
		login[2][1]="pass3";
		login[3][0]="admin4";
		login[3][1]="pass4";
		//print row size
		System.out.println(login.length);
		//print any row cell size
		System.out.println(login[2].length);
		//print any specific row cell data
		System.out.println(login[2][0]);
		//iterate all rows
		for(int i=0;i<=login.length;i++)
		{
			//itarate all cells in each row
			for(int j=0;j<login[i].length;j++)
			{
				System.out.print(login[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
