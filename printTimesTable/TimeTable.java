package printTimesTable;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TimeTable {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("TimeTable.txt");
			{

				pw.println("Times Tables:\n");
				
				for (int i = 1; i <= 10; i += 2) {
				for (int j = 1; j <= 10; j++) {
				
				pw.printf("%-2d * %-2d = %-2d", j, i, i * j);
				pw.printf("%10d * %d = %d\n", j, i + 1, j* (i + 1));

				}
					pw.println();
				}
					pw.flush();
					pw.close();
				System.out.println("File Ready");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Available");
			e.printStackTrace();
		}

	}
	
}
	

	
