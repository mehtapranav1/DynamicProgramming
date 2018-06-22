//only for learning purpose and importing packages and implementing the abstract classes
import javapractice.Abd;


public class absclas extends Abd{
    int k;
    int l;
    public absclas(int i,int j,int k,int l){

        super(i,j);
        this.k=k;
        this.l=l;
    }
    public static void main(String args[]) {
        absclas a = new absclas(1, 2, 3, 4);
        System.out.println(a.i+""+ a.j+""+ a.k+""+ a.l);


    }
}
