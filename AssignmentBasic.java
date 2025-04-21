public class AssignmentBasic {
   public static void main(String[] args) {
   //Q-1:
    System.out.println("Hello,World!\nJava is great");
    //Q-2:
    int i=5;
    System.out.println(i);
    i=i+3;
    System.out.println(i);
    //Q-3:
    int a=4; float b=5.5f; double c=3.9;
    int d=9; float e=7.3f; double f=7.8;
    System.out.println((a+d)+" "+(a*d)+" "+(a/d)+" "+(a-d));
    System.out.println((b+e)+" "+(b*e)+" "+(b/e)+" "+(b-e));
    System.out.println((c+f)+" "+(c*f)+" "+(c/f)+" "+(c-f));
    //Q-4:
    int j=10;
    System.out.println(j);
    j++;
    System.out.println(j);
    j--;
    System.out.println(j);
    System.out.println(j%3);
    //Q-5:
    float r=3.5f;
    System.out.println(3.14*3.5*3.5);
    double  p=1000, t=2, rfi=5;
    double sp=(p*rfi*t)/100;
    System.out.println(sp);
    //Q-7:
    boolean m=5>=9;
    boolean n=6!=8;
    boolean q=1>3;
    boolean o=1<3;
    System.out.println(m);
    System.out.println(n);
    System.out.println(q);
    System.out.println(o);
   }
}
