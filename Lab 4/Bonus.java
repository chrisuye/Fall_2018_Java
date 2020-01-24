public class Bonus
{
    public static void print(int n1, int n2)
    {
        for(int i = 0;i<n1;i++)
        {
            System.out.print(" ");
        }
        for(int i = 0;i<2*n2+1;i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printPattern(int i, int n, boolean flag)
    {
        if(flag == false)
        {
            print(n-i, i-1);
            if(i<n) 
            {
                printPattern(i + 1, n, flag);
            }
            else
            {
                printPattern(i - 1, n, true);
            }
        }
        else
        {
            print(n-i, i-1);
            if(i == 1)
            {
                return;
            }
            printPattern(i - 1, n, flag);
        }
    }

    public static void main(String[] args)
    {
        int n = 4;
        printPattern(1,n,false);
    }
}