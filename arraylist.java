import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(6);
        System.out.println(list.size());
        list.add(0,29);
        //System.out.println(list+" "+list.size());
        list.add(1,67);
       // System.out.println(list+" "+list.size());
        list.add(2,209);
        //System.out.println(list+" "+list.size());
        list.add(3,-89);
        System.out.println(list.size());
        //System.out.println(list+" "+list.size());
        list.remove(1,67);
        //System.out.println(list+" "+list.size());
        System.out.println(list.size());
       /*  for(int ele:list)
        {
            System.out.print(ele+" ");
        }*/
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.size());


       /* ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(29);
        System.out.println(list+" "+list.size());
        list.add(67);
        System.out.println(list+" "+list.size());
        list.add(209);
        System.out.println(list+" "+list.size());
        list.add(-89);
        System.out.println(list+" "+list.size());
        list.remove(1);
        System.out.println(list+" "+list.size());*/
    
    }
    
}
