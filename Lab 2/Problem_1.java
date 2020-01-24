//Program to test the various operations of the day class
//Christian Seyoum
//10/3/2018
//problem 1
import java.io.*;
import java.util.*;

public class Problem_1
{
  public static void main(String[] args)
  {
    String sLine = "";
    String sword;
    String word;
    int iword = 0;
    int ilet = 0;
    int iline = 0;
    try
    {
      Scanner ifsInput = new Scanner(new File("c:/home/text.txt"));//file scanner
      Scanner ifs = new Scanner(new File("c:/home/text.txt"));//file scanner
      while (ifsInput.hasNext())// while loop to read file
      {
        sword = ifsInput.next();
        if (sword != ".")
        {
          iword++;//word counter
        }
        ilet = sword.length() + ilet;//letter counter
      }
      while (ifs.hasNextLine())
      {
        sLine = ifs.nextLine();
        if (sLine != ".")
        {
          iline++;// line counter
        }
      }
    }
    
    catch (FileNotFoundException sMsg)//error
    {
      System.out.print("Error");
    }
    System.out.println("Total number of words: "+iword);
    System.out.println("Total number of lines: "+iline);
    System.out.println("Total number of characters: "+ilet);
  }
}