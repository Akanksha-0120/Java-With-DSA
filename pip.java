public class pip {
    public static void Pip(int n){
       if(n==0) return;
       System.out.print(n);
       Pip(n-1);
       System.out.print(n);
       Pip(n-1);
       System.out.print(n);
    }
    public static void main(String[] args) {
        Pip(3);
    }
}
