package Assignment;

import java.io.FileNotFoundException;

public class RunNaiveBayes {

	public static void main(String[] args) throws FileNotFoundException {
		
		//naiveInterface myFirst = new naiveInterface("Entrepreneur");
		
		System.out.print("this is the interface\n");
		naiveBayes plsrun = new naiveBayes("MLdata.csv");
		plsrun.readCSV();
		System.out.print("this is the interface");
		
		

	}

}