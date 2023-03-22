package Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class naiveBayes {
	
	String csvFile= "C:/Users/willi/Documents/GitHub/Year-2-Java-Assignment/MLdata.csv";
	String line[];
	
	int linecount = 0;
	double gender;
	double parentJob;
	double works;
	double lives;
	double takesBusiness;
	double chanceOfEntp;
	
	public naiveBayes(String csvFile)
	{
		this.csvFile = csvFile;
	}
	
	public void readCSV() throws FileNotFoundException
	{
		BufferedReader readcsv = new BufferedReader(new FileReader(csvFile));
		try
		{
			while((csvFile = readcsv.readLine()) != null)
			{
				line = csvFile.split(",");
				
				if(line[0] == "Female" || line[0] == "Male")
				{
					linecount++;
				}
			}
			System.out.println(linecount);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("an error occured");
		}
	}
}
