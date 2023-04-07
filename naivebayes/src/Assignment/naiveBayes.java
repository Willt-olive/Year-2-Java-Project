package Assignment;

import java.io.*;

public class naiveBayes {
	
	String csvFile;
	String row[];
	
	// variables for entrepreneurs
	int rowcount = 0;
	double male, female;
	double parentJob, noparentJob;
	double works, noworks;
	double rural, urban;
	double takesBusiness, notakesBusiness;
	double chanceOfEntre;
	
	// variables for non entrepreneurs
	double maleNOT, femaleNOT;
	double parentJobNOT, noparentJobNOT;
	double worksNOT, noworksNOT;
	double ruralNOT, urbanNOT;
	double takesBusinessNOT, notakesBusinessNOT;
	double chanceOfEntreNOT;
	
	// variables for likelihood of being entrepreneurs
	double maleLike, femaleLike;
	double parentJobLike, noparentJobLike;
	double worksLike, noworksLike;
	double ruralLike, urbanLike;
	double takesBusinessLike, notakesBusinessLike;
	double chanceOfEntreLike;
	
	// variables for likelihood of not being entrepreneurs
	double maleNOTLike, femaleNOTLike;
	double parentJobNOTLike, noparentJobNOTLike;
	double worksNOTLike, noworksNOTLike;
	double ruralNOTLike, urbanNOTLike;
	double takesBusinessNOTLike, notakesBusinessNOTLike;
	double chanceOfEntreNOTLike;	
	
	// variables to enter data into NaiveBayes through interface for being entrepreneur
	double option1;
	double option2;
	double option3;
	double option4;
	double option5;
	
	// variables to enter data into NaiveBayes through interface being non entrepreneur
	double NOToption1;
	double NOToption2;
	double NOToption3;
	double NOToption4;
	double NOToption5;
	
	// variable to for the final score of being an entrepreneur
	double Entrepreneur;
	
	// sets the path
	public naiveBayes(String csvFile)
	{
		this.csvFile = csvFile;
	}

	// reading the .csv file into the program
	public void readCSV() throws FileNotFoundException
	{
		BufferedReader readcsv = new BufferedReader(new FileReader(csvFile));
		try
		{
			while((csvFile = readcsv.readLine()) != null)
			{
				// seperates the words
				row = csvFile.split(",");
				
				// skips over the first few rows so only data is read
				if(row[0].equals("Male") || row[0].equals("Female"))
				{
					// count for number of data rows, makes it scalable to .csv of any size
					rowcount++;
				}
				
				// if the person is an entrepreneur
				if(row[5].equals("Yes"))
				{
					// count total number of all data
					chanceOfEntre++;
					
					if(row[0].equals("Male"))
					{
						male++;
					}
					else
					{
						female++;
					}
					
					if(row[1].equals("Yes"))
					{
						parentJob++;
					}
					else
					{
						noparentJob++;
					}
					
					if(row[2].equals("Yes"))
					{
						works++;
					}
					else
					{
						noworks++;
					}
					
					if(row[3].equals("Rural"))
					{
						rural++;
					}
					else
					{
						urban++;
					}
					
					if(row[4].equals("Yes"))
					{
						takesBusiness++;
					}
					else
					{
						notakesBusiness++;
					}
					
				}
				// if the person is not an entrepreneur
				else if(row[5].equals("No"))
				{
					// count total number of data
					chanceOfEntreNOT++;

					if(row[0].equals("Male"))
					{
						maleNOT++;
					}
					else
					{
						femaleNOT++;
					}
					
					if(row[1].equals("Yes"))
					{
						parentJobNOT++;
					}
					else
					{
						noparentJobNOT++;
					}
					
					if(row[2].equals("Yes"))
					{
						worksNOT++;
					}
					else
					{
						noworksNOT++;
					}
					
					if(row[3].equals("Rural"))
					{
						ruralNOT++;
					}
					else
					{
						urbanNOT++;
					}
					
					if(row[4].equals("Yes"))
					{
						takesBusinessNOT++;
					}
					else
					{
						notakesBusinessNOT++;
					}
					
				}
			}
			// runs the calculations to get the likelihood
			likelihood();
		}
		catch (IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
	}

	public void getProbablility()
	{
		if(option1 == 1)
		{
			option1 = maleLike;
			NOToption1 = maleNOTLike;
		}
		else
		{
			option1 = femaleLike;
			NOToption1 = femaleNOTLike;
		}
		if(option2 == 1)
		{
			option2 = parentJobLike;
			NOToption2 = parentJobNOTLike;
		}
		else
		{
			option2 = noparentJobLike;
			NOToption2 = noparentJobNOTLike;
		}
		if(option3 == 1)
		{
			option3 = worksLike;
			NOToption3 = worksNOTLike;
		}
		else
		{
			option3 = noworksLike;
			NOToption3 = noworksNOTLike;
		}
		if(option4 == 1)
		{
			option4 = ruralLike;
			NOToption4 = ruralNOTLike;
		}
		else
		{
			option4 = urbanLike;
			NOToption4 = urbanNOTLike;
		}
		if(option5 == 1)
		{
			option5 = takesBusinessLike;
			NOToption5 = takesBusinessNOTLike;
		}
		else
		{
			option5 = notakesBusinessLike;
			NOToption5 = notakesBusinessNOTLike;
		}
		
		
		
		double yesEntre;
		double notEntre;
		yesEntre = chanceOfEntreLike * option1 * option2 * option3 * option4 * option5;
		notEntre = chanceOfEntreNOTLike * NOToption1 * NOToption2 * NOToption3 * NOToption4 * NOToption5;
		
		System.out.println("\nchances of becoming an entrepreneur :"+yesEntre+
				"\nchances of not becoming an entrepreneur :"+notEntre);
		
		
		Entrepreneur = yesEntre - notEntre;
	}
	
	public void likelihood()
	{
		
		maleLike = male/rowcount;
		femaleLike = female/rowcount;
		parentJobLike = parentJob/rowcount;
		noparentJobLike = noparentJob/rowcount;
		worksLike = works/rowcount;
		noworksLike = noworks/rowcount;
		ruralLike = rural/rowcount;
		urbanLike = urban/rowcount;
		takesBusinessLike = takesBusiness/rowcount;
		notakesBusinessLike = notakesBusiness/rowcount;
		
		chanceOfEntreLike = chanceOfEntre/rowcount;
		
		maleNOTLike = maleNOT/rowcount;
		femaleNOTLike = femaleNOT/rowcount;
		parentJobNOTLike = parentJobNOT/rowcount;
		noparentJobNOTLike = noparentJobNOT/rowcount;
		worksNOTLike = worksNOT/rowcount;
		noworksNOTLike = noworksNOT/rowcount;
		ruralNOTLike = ruralNOT/rowcount;
		urbanNOTLike = urbanNOT/rowcount;
		takesBusinessNOTLike = takesBusinessNOT/rowcount;
		notakesBusinessNOTLike = notakesBusinessNOT/rowcount;

		chanceOfEntreNOTLike = chanceOfEntreNOT/rowcount;
		
		// commented out as it is not needed for demonstration
		// but can be used later as an example of data
					
//		System.out.print("For Entrepreneur\n");
//		System.out.print("\nLikelyhood of being male: "+maleLike+
//				"\nLikelyhood of being female: "+femaleLike+
//				"\nLikelyhood of parents having own business: "+parentJobLike+
//				"\nLikelyhood of parents not having own business: "+noparentJobLike+
//				"\nLikelyhood of part time job: "+worksLike+
//				"\nLikelyhood of no part time job: "+noworksLike+
//				"\nLikelyhood of Rural Address: "+ruralLike+
//				"\nLikelyhood of Urban Address: "+urbanLike+
//				"\nLikelyhood of studies business: "+takesBusinessLike+
//				"\nLikelyhood of doesn't studies business: "+notakesBusinessLike+
//				"\nLikelyhood of becoming entrepreneur: "+chanceOfEntreLike);
//		
//		System.out.print("\n\nFor Not an Entrepreneur\n");
//		System.out.print("\nLikelyhood of being male: "+maleNOTLike+
//				"\nLikelyhood of being female: "+femaleNOTLike+
//				"\nLikelyhood of parents having own business: "+parentJobNOTLike+
//				"\nLikelyhood of parents not having own business: "+noparentJobNOTLike+
//				"\nLikelyhood of part time job: "+worksNOTLike+
//				"\nLikelyhood of no part time job: "+noworksNOTLike+
//				"\nLikelyhood of Rural Address: "+ruralNOTLike+
//				"\nLikelyhood of Urban Address: "+urbanNOTLike+
//				"\nLikelyhood of studies business: "+takesBusinessNOTLike+
//				"\nLikelyhood of doesn't studies business: "+notakesBusinessNOTLike+
//				"\nLikelyhood of becoming entrepreneur: "+chanceOfEntreNOTLike);
		
	}

	
	// setters for the GUI to pass choices through
	public void setOption1(double option1) {
		this.option1 = option1;
	}

	public void setOption2(double option2) {
		this.option2 = option2;
	}

	public void setOption3(double option3) {
		this.option3 = option3;
	}

	public void setOption4(double option4) {
		this.option4 = option4;
	}

	public void setOption5(double option5) {
		this.option5 = option5;
	}

	public double getEntrepreneur() {
		return Entrepreneur;
	}
	
	
}