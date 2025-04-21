public class sortarr {
    public static void main(String[] args) {
        int[] a={13,45,63,77};
        int[] b={21,34,56,78,96};
        int[] c=new int[a.length+b.length];
       // int i=0,j=0,k=0;
        int i=a.length-1,j=b.length-1,k=c.length-1;
       // while(i<a.length&&j<b.length)
        while(i>0 && j>0)
        
        {
            if(b[j]>=a[i])
            {
                c[k]=b[j];
               // i++;
                 j--;
            }
            else{
                c[k]=a[i];
                //j++;
                 i--;
            }
            //k++;
            k--;
        }
       // if(i==a.length)
        if(i==0)
        {
           // while(j<b.length)
            while(j>0)
            {
                c[k]=b[j];
               // j++;k++;
                j--;k--;
            }
        }
        //if(j==b.length)
        if(j==0)
        {
           // while(i<a.length)
           while(i>0)
            {
                c[k]=a[i];
                //i++;k++;
                i--;k--;
            }
        }
        for(int ele:c)
        {
            System.out.print(ele+" ");
        }
    }
}
