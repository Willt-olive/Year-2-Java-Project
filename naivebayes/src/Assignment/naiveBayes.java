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
	
	double genderNOT;
	double parentJobNOT;
	double worksNOT;
	double livesNOT;
	double takesBusinessNOT;
	double chanceOfEntreNOT;
	
	double genderLike;
	double parentJobLike;
	double worksLike;
	double livesLike;
	double takesBusinessLike;
	double chanceOfEntreLike;
	
	double genderNOTLike;
	double parentJobNOTLike;
	double worksNOTLike;
	double livesNOTLike;
	double takesBusinessNOTLike;
	double chanceOfEntreNOTLike;	
	
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
				
				// skips over the first few rows so only data is read
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
					genderLike = gender/rowcount;
					parentJobLike = parentJob/rowcount;
					worksLike = works/rowcount;
					livesLike = lives/rowcount;
					takesBusinessLike = takesBusiness/rowcount;
					chanceOfEntreLike = chanceOfEntre/rowcount;
					
					}
				// if the person is not an entrepreneur
				else if(row[5].equals("No"))
				{
					chanceOfEntreNOT++;

					if(row[0].equals("Male"))
					{
						genderNOT++;
					}
					
					if(row[1].equals("Yes"))
					{
						parentJobNOT++;
					}
					
					if(row[2].equals("Yes"))
					{
						worksNOT++;
					}
					
					if(row[3].equals("Rural"))
					{
						livesNOT++;
					}
					
					if(row[4].equals("Yes"))
					{
						takesBusinessNOT++;
					}
					genderNOTLike = genderNOT/rowcount;
					parentJobNOTLike = parentJobNOT/rowcount;
					worksNOTLike = worksNOT/rowcount;
					livesNOTLike = livesNOT/rowcount;
					takesBusinessNOTLike = takesBusinessNOT/rowcount;
					chanceOfEntreNOTLike = chanceOfEntreNOT/rowcount;
					
				}
			}
			System.out.print("For Entreprenuer\n");
			System.out.print("\nLikelyhood of being male: "+genderLike+
					"\nLikelyhood of parents having own business: "+parentJobLike+
					"\nLikelyhood of part time job: "+worksLike+
					"\nLikelyhood of Rural Address: "+livesLike+
					"\nLikelyhood of studies business: "+takesBusinessLike+
					"\nLikelyhood of becoming entreprenuer: "+chanceOfEntreLike);
			
			System.out.print("\n\nFor Not an Entreprenuer\n");
			System.out.print("\nLikelyhood of being male: "+genderNOTLike+
					"\nLikelyhood of parents having own business: "+parentJobNOTLike+
					"\nLikelyhood of part time job: "+worksNOTLike+
					"\nLikelyhood of Rural Address: "+livesNOTLike+
					"\nLikelyhood of studies business: "+takesBusinessNOTLike+
					"\nLikelyhood of becoming entreprenuer: "+chanceOfEntreNOTLike);
			
		}
		catch (IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
	}
}