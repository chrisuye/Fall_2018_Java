//Generic interface that describes various searching and sorting
//algorithms. Note that the type parameter is unbounded. However,
//for these algorithms to work correctly, the data objects must
//be compared using the method compareTo and equals.
//In other words, the classes implementing the list objects
//must implement the interface Comparable. The type parameter T
//is unbounded because we would like to use these algorithms to
//work on an array of objects as well as on objects of the classes
//UnorderedArrayList and OrderedArrayList.

public interface SearchSortADT
{
    public int seqSearch(int[] list, int start, int length, int searchItem);
       //Sequantial search algorithm.
       //Postcondition: If searchItem is found in the list,
       //               it returns the location of searchItem;
       //               otherwise it returns -1.

    public int binarySearch(int[] list, int start, int length, int searchItem);
       //Binary search algorithm.
       //Precondition: The list must be sorted.
       //Postcondition: If searchItem is found in the list,
       //               it returns the location of searchItem;
       //               otherwise it returns -1.

    public void bubbleSort(int list[], int length);
       //Bubble sort algorithm.
       //Postcondition: list objects are in ascending order.

    /*public void selectionSort(int[] list, int length);
       //Selection sort algorithm.
       //Postcondition: list objects are in ascending order.

    public void insertionSort(int[] list, int length);
       //Insertion sort algorithm.
       //Postcondition: list objects are in ascending order.

    public void quickSort(int[] list, int length);
       //Quick sort algorithm.
       //Postcondition: list objects are in ascending order.

    public void heapSort(int[] list, int length);
       //Heap sort algorithm.
       //Postcondition: list objects are in ascending order.
       */
}


