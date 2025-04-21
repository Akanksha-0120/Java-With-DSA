import java.util.ArrayList;
import java.util.List;
public class listarrlist {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(19);a.add(21);
        List<Integer> b=new ArrayList<>();
        b.add(56);b.add(87);b.add(35);b.add(76);
        List<Integer> c=new ArrayList<>();
        c.add(67);c.add(91);c.add(43);
        List<List<Integer>> l=new ArrayList<>();
        l.add(a);l.add(b);l.add(c);
        System.out.println("first way:");
       for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
            System.out.println();
        }
        
        System.out.println("for one element:");
       System.out.println(l.get(1).get(1));
       
      System.out.println("second way:");
       for(int i=0;i<l.size();i++)
       {
          List<Integer> x= l.get(i);
          for(int j=0;j<x.size();j++)
          {
            System.out.print(x.get(j)+" ");
          }

          System.out.println();
       }
    }
    
}
