/* christian seyoum
 * 8/30/2018
 */
import java.io.*;
import java.util.*;
public class Problem_2
{
  public static void main(String[] args)
  {
    int iNum[] = new int[8];
    int iSum;
    int iTotal;
    iTotal = 0;
    iSum = 0;
    try
    {
      Scanner ifsInput = new Scanner(new File("c:/home/Num.txt"));
      while (ifsInput.hasNextInt())
      {
        for( int iCount=0; iCount<8; iCount++)
        {
        iNum[iCount] = ifsInput.nextInt();
        
        if (iCount%2 != 0)
        {
          iSum = iSum + iNum[iCount];
        }
        }
        //System.out.println(iNum);
      }
      System.out.println("Total tickets solid: "+iSum);
      for (int iCount1 = 0; iCount1<8; iCount1 = iCount1 + 2)
      {
        iTotal = iTotal + (iNum[iCount1] * iNum[iCount1+1]);
      }
      System.out.println("Total sale amount: "+iTotal);
    }
    catch (FileNotFoundException sMsg)
    {
      System.out.println("E");
    }
  }
}