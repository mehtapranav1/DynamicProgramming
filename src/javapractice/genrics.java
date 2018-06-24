package javapractice;

class hashtable<k,v> {
k key;
v value;
    hashtable(k key,v value){
        this.key=key;
        this.value=value;
    }

    @Override
    public String toString() {
        return key+" "+value;
    }
}

public class genrics {
    public static void main(String args[]) {
    hashtable<String,Integer>  hash = new hashtable<>("hello World!",45);
     String h = hash.toString();
      System.out.println(h);
    }
}
