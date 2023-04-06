package Assignment;

import java.io.*;

public class naiveBayes {
	
	String csvFile;
	String row[];
	
	int rowcount = 0;
	double gender;
	double parentJob;
	double works;
	double lives;
	double takesBusiness;
	double chanceOfEntre;
	
	
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
				row = csvFile.split(",");
				
				if(row[0].equals("Male") || row[0].equals("Female"))
				{
					rowcount++;
				}
				
				// if the person is an entrepreneur
				if(row[5].equals("Yes"))
				{
					chanceOfEntre++;
					
					if(row[0].equals("Male"))
					{
						gender++;
						System.out.print(gender);

					}
					
					if(row[1].equals("Yes"))
					{
						parentJob++;
					}
					
					if(row[2].equals("Yes"))
					{
						works++;
					}
					
					if(row[3].equals("Rural"))
					{
						lives++;
					}
					
					if(row[4].equals("Yes"))
					{
						takesBusiness++;
					}
					
				}
				// if the person is not an entrepreneur
				else if(row[5].equals("No"))
				{
					chanceOfEntre--;

					if(row[0].equals("Male"))
					{
						gender++;
						System.out.print(gender+"\n");
					}
					
					if(row[1].equals("Yes"))
					{
						parentJob++;
					}
					
					if(row[2].equals("Yes"))
					{
						works++;
					}
					
					if(row[3].equals("Rural"))
					{
						lives++;
					}
					
					if(row[4].equals("Yes"))
					{
						takesBusiness++;
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


