import java.io.*;
import java.util.*;
public class InputData
{
  public static void main(String[] args)
  {
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Integer> grade = new ArrayList<Integer>();
    int count = 0;
    int a = 0;
    int b = 0;
    int sum = 0;
    int temp = 0;
    double avg;
    
    try
    {
      Scanner ifsInput = new Scanner(new File("InputData.txt"));
      while (ifsInput.hasNext())
      {
        if(count%2 == 0)
        {
          name.add(a,ifsInput.next());
          a++;
        }
        else
        {
          grade.add(b,ifsInput.nextInt());
          b++;
        }
        count++;
        
      }
      for (int x = 0; x<grade.size(); x++)
      {        
        sum = sum + grade.get(x);
      }
      avg = (double)sum/(double)grade.size();
      
      System.out.println("Average score is: "+avg);
      System.out.println("********************************************");
      System.out.println("The following students have scored below the the average score:");  
      
      for (int y = 0; y < name.size(); y++)
      {
        if (grade.get(y) < avg)
        {
          System.out.println(name.get(y));
        }
      }
      
      System.out.println("********************************************");
      
      for(int z = 0; z < grade.size(); z++)
      {
        if (grade.get(z) > temp)
        {
          temp = grade.get(z);
        }
      }
      System.out.println("The highest test Score is: "+temp);
      System.out.println("\nThe following students have attened the highest score: ");
      
      for( int d = 0; d < name.size(); d++)
      {
        if (grade.get(d) == temp)
        {
          System.out.println(name.get(d));
        }
      }
    }
    catch(FileNotFoundException sMsg)
    {
    }
  }
}