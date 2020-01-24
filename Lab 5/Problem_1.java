import java.util.*;
import java.io.*;
public class Problem_1
{
  public static void main(String args[])
  {
    ArrayList<String> name = new ArrayList<String>();
    
    int size = 0;
    try
    {
      Scanner ifsInput = new Scanner(new File("name.txt"));
      while (ifsInput.hasNextLine())
      {
        size++;
        name.add(ifsInput.nextLine());
      }
      String[] lines=new String[size];
      
      for(int i=0; i<size; i++)
      {
        lines[i] = name.get(i);
      }
      System.out.println("Lines Before Sorting:");
      System.out.print(name);
      mergeSort(lines);
      System.out.println();
      System.out.println("Lines after Sorting:");
      System.out.println(Arrays.toString(lines));
    }
    catch (FileNotFoundException sMsg)
    {
      System.out.print("error");
    }
    
  }
  public static void mergeSort(String[] s)
   {
   if(s.length>1)
   {
   String[] left=Arrays.copyOfRange(s,0,s.length/2);
   String[] right=Arrays.copyOfRange(s,s.length/2,s.length);
   mergeSort(left);
   mergeSort(right);
   merge(s,left,right);
   }
   }
   public static void merge(String[] result, String[] left, String[] right)
   {
   int i1 = 0;
   int i2 = 0;
   for (int i = 0; i < result.length; i++)
   {
   if (i2 >= right.length || (i1 < left.length &&left[i1].compareToIgnoreCase(right[i2])<0))
   {
   result[i] = left[i1];
   i1++;
   }
   else
   {
   result[i] = right[i2];
   i2++;
   }
   }
   }
   }