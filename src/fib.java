public class fib {
    static int dyfib(int n)//dynamic
    { int a[] = new int[n+2];
        int i;
        a[0] = 0;
        a[1] = 1;
        for (i = 2; i <= n; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
        static int refib(int n)//recursive
        {
            if(n == 0)
                return 0;
            else if(n == 1)
                return 1;
            else
                return refib(n - 1) + refib(n - 2);

        }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(refib(n));
        System.out.println(dyfib(n));
    }
}
