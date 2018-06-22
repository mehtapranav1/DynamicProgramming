package javapractice;

 class Apple extends Abd {
    int k;
    int l;
    public Apple(int i,int j,int k,int l){

        super(i,j);
        this.k=k;
        this.l=l;
    }
     public static void main(String args[]) {
         Apple a = new Apple(1, 2, 3, 4);
         System.out.println(a.i+""+ a.j+""+ a.k+""+ a.l);


     }
}
