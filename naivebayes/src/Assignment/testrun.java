package Assignment;

import java.io.File;
import java.util.Scanner;

public class testrun
{
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("MLdata.csv"));
    //parsing a CSV file into the constructor of Scanner class 
    sc.useDelimiter(",");
    //setting comma as delimiter pattern
    while (sc.hasNext()) {
      System.out.print(sc.next());
    }
    sc.close();
    //closes the scanner  
  }
}