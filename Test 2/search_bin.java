public class search_bin
{
  public static void main(String[] args)
  {
    int a[] = new int[] {1,2,3,4,5,6,66,77,88,99,156,158,178,188,200};
    
    int s = 99;
    int ind = -1;
    int min = 0;
    int max = a.length-1;
    int c = 0;
    while(min <= max)
    {
      int mid = (min +max)/2;
      
      if (a[mid]<s)
      {
        min = mid +1;
      }
      else if(a[mid] > s)
      {
        max = mid - 1;
      }
      else
      {
        ind = mid;
      }
    }
    System.out.print(ind);
  }
}