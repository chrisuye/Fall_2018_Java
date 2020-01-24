//Program to test the various operations of the day class
//Christian Seyoum
//10/3/2018
//problem 2
import java.util.*;
public class Problem_2
{
  public static void main(String[] args)
  {
     // Declare array
       int[] ids = new int[30];
       // Scanner to read data from system
       Scanner input = new Scanner(System.in);
       for (int i = 0; i < ids.length; i++)
       {
         do
         {
           System.out.println("Please enter the ID for Person : " + (i + 1));
           ids[i] = input.nextInt();
         }while(ids[i] < 0 || ids[i] > 30);
       }
       // Array is filled till now

       //Call to find duplicates
       findDuplicates(ids);
      
       int first=findMostFrequentElement(ids);
       //Now delete this item from array and repeat the process to find most frequent elements
       //Set the positions of most frequent element as 0
       for(int i=0;i<ids.length;i++)
       {
           if(ids[i]==first)
           {
               ids[i]=0;
           }
       }
       //Call findMostFrequentElement again for finding second element
       int second=findMostFrequentElement(ids);
       System.out.println("Most frequent Elements is : "+first +"   and second frequent Elements is: "+second);
   }

   // This method is used to find duplicates in array
   public static void findDuplicates(int[] array) 
   {
       for (int i = 0; i < array.length - 1; i++) 
       {
           for (int j = i + 1; j < array.length; j++)
           {
               if ((array[i] == array[j]) && (i != j))
               {
                   System.out.println("Duplicate Element is : " + array[j]);
                   break;
               }
           }
       }
   }
  
   // Method to find most frequent element
   public static int findMostFrequentElement(int[] array) 
   {
       int count = 1, tmpCount;
       int frequentElement = array[0];
       int temp = 0;
       for (int i = 0; i < (array.length - 1); i++)
       {
           temp = array[i];
           tmpCount = 0;
           for (int j = 1; j < array.length; j++)
           {
               if (temp>0 && temp == array[j])
               {
                   tmpCount++;
               }
           }
           if (tmpCount > count) 
           {
               frequentElement = temp;
               count = tmpCount;
           }
       }
       return frequentElement;
   }
    
}