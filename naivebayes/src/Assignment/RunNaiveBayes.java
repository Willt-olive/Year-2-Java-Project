package Assignment;

import java.io.FileNotFoundException;

public class RunNaiveBayes {

	public static void main(String[] args) {
		
		naiveBayes plsrun = new naiveBayes(null);
		try {
			plsrun.readCSV();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.print("That didnt work");
		}

	}

}
