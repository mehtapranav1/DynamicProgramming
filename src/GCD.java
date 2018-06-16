public class GCD {
    static int GCD(int n,int m){
        int i;
        int gcd=1;

        for(i=1;i<m;i++){
            if(m%i==0&&n%i==0) {
                 gcd= i;
            }

        }
        return gcd;
    }
    public static void main (String args[])
    {
        int n = 9;
        int m = 6;
        System.out.println(GCD(n,m));
    }
}
