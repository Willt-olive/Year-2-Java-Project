package Assignment;

/************************************
 * naiveBayes: 	the purpose of this class is to calculate the likelihood of a person
 * 				given certain parameters of becoming a entrepreneur. This is calculated
 * 				using the Naive Bayes method.
 * @author William Don Moore C21437002
 * Date: 07/04/2023
 ***********************************/

import java.io.*;

public class naiveBayes
{
	
	String csvFile;	// for read csv
	String csvFile2;	// for testMode get size
	String csvFile3;	// for testMode 
	String csvFile4;	// for testMode
	String row[];	// for read csv
	String row2[];	// for testMode
	String row3[];	// for testMode
	int rowcount = 0;
	int i = 0;
	
	// variables for entrepreneurs
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
	
	// variables to for the final score of being an entrepreneur
	double Entrepreneur;
	double yesEntre;
	double notEntre;
	
	// variables for testMode
	int test = 0;
	int testModeSize;
	int sampleTest;
	double percentage;
	int dontMatch = 0;
	int matching = 0;
	
	// sets the path to csv file
	public naiveBayes(String csvFile)
	{
		this.csvFile = csvFile;
		this.csvFile2 = csvFile;
		this.csvFile3 = csvFile;
		this.csvFile4 = csvFile;
	}

	// reading the .csv file into the program
	public void readCSV() throws FileNotFoundException
	{
		BufferedReader readcsv = new BufferedReader(new FileReader(csvFile));
		try
		{
			while((csvFile = readcsv.readLine()) != null)
			{
				// separates the words
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

	// calculates the liklihood of being an entrepreneur or not
	public void getProbablility()
	{
		// set both options yes and no
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
		
		// scores of both entrepreneurs and non entrepreneurs
		yesEntre = chanceOfEntreLike * option1 * option2 * option3 * option4 * option5;
		notEntre = chanceOfEntreNOTLike * NOToption1 * NOToption2 * NOToption3 * NOToption4 * NOToption5;
		
		// binary test so that scores dont gets printed on self test on repeat
		if(test == 1)
		{
			System.out.println("\nchances of becoming an entrepreneur :"+yesEntre+
					"\nchances of not becoming an entrepreneur :"+notEntre);
			test = 0;
		}
		
		// final score, if positive, entrepreneur, if negative, not
		Entrepreneur = yesEntre - notEntre;
	}
	
	// calculations for actual likelihoods
	public void likelihood()
	{
		
		//likelihoods for individual parameters
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
		
		// normal chance of entrepreneur
		chanceOfEntreLike = chanceOfEntre/rowcount;
		
		//likelihoods for individual parameters
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

		// normal chance of not entrepreneur
		chanceOfEntreNOTLike = chanceOfEntreNOT/rowcount;		
	}

	public void testMode() throws FileNotFoundException
	{
		//self tester
		BufferedReader readcsv2 = new BufferedReader(new FileReader(csvFile2));
		try {
			while((csvFile2 = readcsv2.readLine()) != null) {
				
				row = csvFile2.split(",");

				if(row[0].equals("Male") || row[0].equals("Female"))
				{
					rowcount = rowcount+1;	
				}
			}
			readcsv2.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		// needs cast
		// set to 70% and 30% but can be easily changed
		testModeSize = (int) (rowcount * 0.7);
		sampleTest = rowcount - testModeSize;
		
		BufferedReader readcsv3 = new BufferedReader(new FileReader(csvFile3));
		try
		{
			i = 0;
			while((csvFile3 = readcsv3.readLine()) != null)
			{
				if(i < testModeSize)
				{
					row2 = csvFile3.split(",");
					
					// skips over the first few rows so only data is read
					if(row2[0].equals("Male") || row2[0].equals("Female"))
					{
						
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
					i++;
				}
				else
				{
					readcsv3.readLine();
				}
			}
			readcsv3.close();
			likelihood();	
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		BufferedReader readcsv4 = new BufferedReader(new FileReader(csvFile4));
		
		i = 0;
		try
		{
			while((csvFile4 = readcsv4.readLine()) != null)
			{
				if(i < (testModeSize+3))
				{	
					row3 = csvFile4.split(",");
					
					if(row3[0].equals("Male"))
					{
						option1 = maleLike;
					}
					else
					{
						NOToption1 = femaleLike;
					}

					if(row3[1].equals("Yes"))
					{
						option2 = parentJobLike;
					}
					else
					{
						NOToption2 = noparentJobLike;
					}

					if(row3[2].equals("Yes"))
					{
						option3 = worksLike;
					}
					else
					{
						NOToption3 = noworksLike;
					}

					if(row3[3].equals("Yes"))
					{
						option4 = takesBusinessLike;
					}
					else
					{
						NOToption4 = notakesBusinessLike;
					}
					if(row3[4].equals("Rural"))
					{
						option5 = ruralLike;
					}
					else
					{
						NOToption5 = urbanLike;
					}
					
					getProbablility();
					
					// if the score is higher for yes
					if(notEntre < yesEntre )
					{
						// and equals yes
						if(row3[5].equals("Yes"))
						{
							// they match higher percentage
							matching++;
						}
						else
						{
							dontMatch++;
						}
					}
					// if the score is higher for no
					else if(notEntre > yesEntre )
					{
						// and it is no
						if(row3[5].equals("No"))
						{
							// they match, higher percentage
							matching++;
						}
						else
						{
							dontMatch++;
						}
					}
					else
					{
						System.out.println("an error occured");
					}
				}
				else
				{
					System.out.println("an error occured");
				}
				i++;
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// needs cast
		percentage = (double)matching/sampleTest;
		percentage = percentage*100;
		
		System.out.println("Self Test is "+percentage+"%");
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

	public void setTest(int test) {
		this.test = test;
	}

	public double getEntrepreneur() {
		return Entrepreneur;
	}	

}