package Assignment;

import java.io.*;

public class naiveBayes {
	
	String csvFile= "MLdata.csv";
	String row[];
	
	int rowcount = 0;
	double gender;
	double parentJob;
	double works;
	double lives;
	double takesBusiness;
	double chanceOfEntp;
	
	public naiveBayes()
	{

	}
	
	public void readCSV() throws FileNotFoundException
	{
		BufferedReader readcsv = new BufferedReader(new FileReader("MLdata.csv"));
		try
		{
			while((csvFile = readcsv.readLine()) != null)
			{
				row = csvFile.split(",");
				
				// skips over the top few rows in the file 
				if(row[0] == "Female" || row[0] == "Male")
				{
					rowcount++;
				}
				
				// if the person is an entrepreneur
				if(row[5].equals("Yes"))
				{
					if(row[0].equals("Male"))
					{

					}
					
					if(row[1].equals("Yes"))
					{

					}
					
					if(row[2].equals("Yes"))
					{

					}
					
					if(row[3].equals("Rural"))
					{

					}
					
					if(row[4].equals("Yes"))
					{

					}
					
				}
				// if the person is not an entrepreneur
				else if(row[5].equals("No"))
				{

					if(row[0].equals("Male"))
					{

					}
					
					if(row[1].equals("Yes"))
					{

					}
					
					if(row[2].equals("Yes"))
					{

					}
					
					if(row[3].equals("Rural"))
					{

					}
					
					if(row[4].equals("Yes"))
					{

					}
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
	}
}


