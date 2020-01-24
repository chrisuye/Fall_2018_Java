public class recursive_test
{
  public static void main(String[] args)
  {
    rname(5);
  }
 public static void rname(int n) 
 {
   
   if ( n == 1)
   {
     System.out.println("*");
   }
   else
   {
     for (int i=0; i<n; i++)
     {
     System.out.print("*");
     }
     System.out.println("");
     
     rname(n-1);
     
     for (int i=0; i<n; i++)
     {
     System.out.print("*");
     }
     System.out.println("");
     
   }
}
}
