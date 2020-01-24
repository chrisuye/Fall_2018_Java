//Generic interface that describes various searching and sorting
//algorithms. Note that the type parameter is unbounded. However,
//for these algorithms to work correctly, the data objects must
//be compared using the method compareTo and equals.
//In other words, the classes implementing the list objects
//must implement the interface Comparable. The type parameter T
//is unbounded because we would like to use these algorithms to
//work on an array of objects as well as on objects of the classes
//UnorderedArrayList and OrderedArrayList.

public class SearchSortAlgorithms implements SearchSortADT
{
  private int count;
  
   public int noOfComparisons()
   {
   //Dr. Yu - finish this method
     return count;
   }
   
   public void initializeNoOfComparisons()
   {
   count = 0;
   }
  
  //Sequantial search algorithm.
  //Postcondition: If searchItem is found in the list,
  //               it returns the location of searchItem;
  //               otherwise it returns -1.
  public int seqSearch(int[] list, int start, int length, int searchItem)
  {
    int loc;
    boolean found = false;
    initializeNoOfComparisons();
    
    for (loc = start; loc < length; loc++)
    {
      count++;
      if (list[loc] == searchItem)
      {
        found = true;
        break;
      }
    }
    
    if (found)
      return loc;
    else
      return -1;
  } //end seqSearch
  
  //Binary search algorithm.
  //Precondition: The list must be sorted.
  //Postcondition: If searchItem is found in the list,
  //               it returns the location of searchItem;
  //               otherwise it returns -1.
  public int binarySearch(int[] list, int start, int length, int searchItem)
  {
    int first = start;
        int last = list.length-1;
        int mid = 0;
        initializeNoOfComparisons();
       
        while (first <= last) {
            mid = (first + last) / 2;
            count++;
            if (list[mid] == searchItem) {
                //System.out.println("Element "+element+" is found at location: "+(mid+1));
                return mid;
            } else if (list[mid] < searchItem) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        
        return -1;
   
  }//end binarySearch
  
  public int binSeqSearch15(int[] list, int start, int length, int searchItem)
  {
    int first = start;
    int last = length - 1;
    int mid = -1;
    int loc = -1;
    
    boolean found = false;
    
    while (first <= last)
    {
      mid = (first + last) / 2;
      
      if (list[mid] > searchItem)
      {
        first = mid - 1;
      }
      else if (list[mid] < searchItem)
      {
        last = mid + 1;
      }
      else
      {
        found = true;
        loc = mid;
      }
    }
    
    if (found)
      return loc;
    else
      return seqSearch(list, first, last, searchItem);
    
  }
  
  //Bubble sort algorithm.
  //Postcondition: list objects are in ascending order.
  public void bubbleSort(int list[], int length)
  {
    for(int i=0;i<list.length-1;i++)
    {
      for(int j=i+1;j<list.length;j++)
      {
        if(list[i]>list[j]){
          int tmp=list[i];
          list[i]=list[j];
          list[j]=tmp;  
        }
      }
    }
  }//end bubble sort
  
  //Selection sort algorithm.
  //Postcondition: list objects are in ascending order.
  /* public void selectionSort(int[] list, int length)
   {
   for (int index = 0; index < length - 1; index++)
   {
   int minIndex = minLocation(list, index, length - 1);
   
   swap(list, index, minIndex);
   }
   }//end selectionSort
   
   //Method to determine the index of the smallest item in
   //list between the indices first and last..
   //This method is used by the selection sort algorithm.
   //Postcondition: Returns the position of the smallest
   //               item.in the list.
   private int minLocation(int[] list, int first, int last)
   {
   int minIndex = first;
   
   for (int loc = first + 1; loc <= last; loc++)
   {
   Comparable<integer> compElem = (Comparable<integer>) list[loc];
   
   if (compElem.compareTo(list[minIndex]) < 0)
   minIndex = loc;
   }
   
   return minIndex;
   }//end minLocation
   
   //Method to swap the elements of the list speified by
   //the parameters first and last..
   //This method is used by the algorithms selection sort
   //and quick sort..
   //Postcondition: list[first] and list[second are
   //swapped..
   private void swap(int[] list, int first, int second)
   {
   int temp;
   
   temp = list[first];
   list[first] = list[second];
   list[second] = temp;
   }//end swap
   
   //Insertion sort algorithm.
   //Postcondition: list objects are in ascending order.
   public void insertionSort(int[] list, int length)
   {
   for (int firstOutOfOrder = 1; firstOutOfOrder < length;
   firstOutOfOrder ++)
   {
   Comparable<integer> compElem =
   (Comparable<integer>) list[firstOutOfOrder];
   
   if (compElem.compareTo(list[firstOutOfOrder - 1]) < 0)
   {
   Comparable<integer> temp =
   (Comparable<integer>) list[firstOutOfOrder];
   
   int location = firstOutOfOrder;
   
   do
   {
   list[location] = list[location - 1];
   location--;
   }
   while (location > 0 &&
   temp.compareTo(list[location - 1]) < 0);
   
   list[location] = (int) temp;
   }
   }
   }//end insertionSort
   
   //Quick sort algorithm.
   //Postcondition: list objects are in ascending order.
   public void quickSort(int[] list, int length)
   {
   recQuickSort(list, 0, length - 1);
   }//end quickSort
   
   //Method to partition the list between first and last.
   //The pivot is choosen as the middle element of the list.
   //This method is used by the recQuickSort method.
   //Postcondition: After rearranging the elements,
   //               according to the pivot, list elements
   //               between first and pivot location - 1,
   //               are smaller the the pivot and list
   //               elements between pivot location + 1 and
   //               last are greater than or equal to pivot.
   //               The position of the pivot is also
   //               returned.
   private int partition(int[] list, int first, int last)
   {
   int pivot;
   
   int smallIndex;
   
   swap(list, first, (first + last) / 2);
   
   pivot = list[first];
   smallIndex = first;
   
   for (int index = first + 1; index <= last; index++)
   {
   Comparable<integer> compElem = (Comparable<integer>) list[index];
   
   if (compElem.compareTo(pivot) < 0)
   {
   smallIndex++;
   swap(list, smallIndex, index);
   }
   }
   
   swap(list, first, smallIndex);
   
   return smallIndex;
   }//end partition
   
   //Method to sort the elements of list between first
   //and last using quick sort algorithm,
   //Postcondition: list elements between first and last
   //               are in ascending order.
   private void recQuickSort(int[] list, int first, int last)
   {
   if (first < last)
   {
   int pivotLocation = partition(list, first, last);
   recQuickSort(list, first, pivotLocation - 1);
   recQuickSort(list, pivotLocation + 1, last);
   }
   }//end recQuickSort
   
   //Heap sort algorithm.
   //Postcondition: list objects are in ascending order.
   public void heapSort(int[] list, int length)
   {
   buildHeap(list, length);
   
   for (int lastOutOfOrder = length - 1; lastOutOfOrder >= 0;
   lastOutOfOrder--)
   {
   T temp = list[lastOutOfOrder];
   list[lastOutOfOrder] = list[0];
   list[0] = temp;
   heapify(list, 0, lastOutOfOrder - 1);
   }//end for
   }//end heapSort
   
   //Method to the restore the heap in the list between
   //low and high.
   //This method is used by the heap sort algorithm and
   //the method buildHeap.
   //Postcondition: list elemets between low and high are
   //               in a heap.
   private void heapify(int[] list, int low, int high)
   {
   int largeIndex;
   
   Comparable<integer> temp =
   (Comparable<integer>) list[low];  //copy the root
   //node of
   //the subtree
   
   largeIndex = 2 * low + 1;  //index of the left child
   
   while (largeIndex <= high)
   {
   if (largeIndex < high)
   {
   Comparable<integer> compElem =
   (Comparable<integer>) list[largeIndex];
   
   if (compElem.compareTo(list[largeIndex + 1]) < 0)
   largeIndex = largeIndex + 1; //index of the
   //largest child
   }
   
   if (temp.compareTo(list[largeIndex]) > 0) //subtree
   //is already in a heap
   break;
   else
   {
   list[low] = list[largeIndex]; //move the larger
   //child to the root
   low = largeIndex;    //go to the subtree to
   //restore the heap
   largeIndex = 2 * low + 1;
   }
   }//end while
   
   list[low] = (int) temp; //insert temp into the tree,
   //that is, list
   }//end heapify
   
   
   //Method to convert an array into a heap.
   //This method is used by the heap sort algorithm
   //Postcondition: list elements are in a heap.
   private void buildHeap(int[] list, int length)
   {
   for (int index = length / 2 - 1; index >= 0; index--)
   heapify(list, index, length - 1);
   }//end buildHeap*/
}
