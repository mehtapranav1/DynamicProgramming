package javapractice;
import java.util.Scanner;

interface RBI{

    public default String getname()
    {
        System.out.println("enter the name");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        return name;
    }
    public  default   void setname()
    {
        String sc = getname();
        System.out.println("the name is:-"+sc);
    }
}
class apple implements RBI
{
public void hro(){

    setname();
}
}
public class mango  {
    public static void main(String args[]) {
        apple n = new apple();
       n.hro();
    }
}
