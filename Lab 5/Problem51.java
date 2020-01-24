import java.util.*;

public class Problem51
{
    static Scanner console = new Scanner(System.in);

    final static int SIZE = 1500;

    public static void main(String[] args)
    {
        int[] list=new int[SIZE];
        int iRand;
        int loc;
        int search;

        SearchSortAlgorithms intSearchObject
                            = new SearchSortAlgorithms();
        Random rand = new Random();
        Scanner cin = new Scanner(System.in);
        
        iRand = rand.nextInt((100-0)+1)+0;
        System.out.println("Before sorting");
        for(int i=0; i<SIZE; i++)
        {
          iRand = rand.nextInt((15-0)+1)+0;
          list[i] = iRand;
          System.out.print(list[i]+", ");
        }
        System.out.println("");
        System.out.print("Search value: ");
        search = cin.nextInt();
        loc = intSearchObject.seqSearch(list, 0, SIZE, search);
        System.out.println("This many comparisons were made in seqSearch: "+intSearchObject.noOfComparisons());
        
        if(loc >= 0)
        {
        System.out.println("The element is located at index: " +loc);
        }
        else
        {
          System.out.println("number not found");
        }
        
        
        intSearchObject.bubbleSort(list, SIZE);
        System.out.println("After sorting");
        for(int i=0; i<SIZE; i++)
        {
          System.out.print(list[i]+ ", ");
        }
        System.out.println("");
        loc = intSearchObject.binarySearch(list,0, SIZE, search);
         if(loc >= 0)
        {
        System.out.println("The element is located at index: " +loc);
        }
        else
        {
          System.out.println("number not found");
        }
        System.out.println("This many comparisons were made in binary: "+intSearchObject.noOfComparisons());

    
  //Dr. Yu
 
 }
}

