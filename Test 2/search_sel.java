public class search_sel
{
  public static void main(String[] args)
  {
    int a[] = new int[] {4,2,34,67,34,5,67,65,33,4,99,0,2,4,6,5,4,3};
    
    int s = 99;
    int ind = -1;
    for (int i=0; i<a.length-1; i++)
    {
      if (s == a[i])
      {
        ind = i;
        break;
      }
    }
    System.out.print(ind);
  }
}