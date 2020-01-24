public class problem_3
{
    public static void print(int i, int n)
    {
        if(i == 2*n)
        {
            return;
        }
        else if(i<n)
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
            print(i + 1, n);
        }
        else
        {
            i = i % n;
            if(i == 1)
            {
                for (int j = 0; j < 6; j++) 
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int j = 0; j < (n-i); j++) 
            {
                System.out.print("*");
            }
            System.out.println();
            print(i + 1+ n, n);
        }
    }
    public static void main( String [] args )
    {
        int n = 6;
        print(1,n);
    }
}