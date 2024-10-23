package practice_javaarray;

public class PMultidimensionalarray {

	public static void main(String[] args) {
		// Student login data 
		String login[][]= {{"admin1", "pass1"},{"admin2","pass2"},{"admin3","pass3"},{"admin4","pass4"}};
		//print row size
		System.out.println(login.length);
		//print any row cell size
		System.out.println(login[2].length);
		//print any row cell data
		System.out.println(login[3][1]);
		//itarate all rows
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
