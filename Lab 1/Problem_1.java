//Christian Seyoum
//9/15/2018

public class Problem_1
{
  public static void main(String[] args)
  {
    int c = 0;
    int e = 0;
    for(int a=0; a<7; a++)
    {
      for(int b=c; b<6; b++)
      {
        System.out.print("*");
      }
      for(int space=0; space<=c; space++)
      {
        System.out.print(" ");
      }          
      for(int d=e; d<6; d++)
      {
        System.out.print("//");
      }
      for(int f=0; f<e; f++)
      {
        System.out.print("\\"+"\\");
      }
      for(int space1=0; space1<=c; space1++)
      {
        System.out.print(" ");
      }
      for(int g=c; g<6; g++)
      {
        System.out.print("*");
      }
      System.out.println("");
      c++;
      e++;
    }
  }
}