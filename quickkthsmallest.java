public class quickkthsmallest {

    static int ans;
    public static void print(int[] arr)
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swapping(int[] arr,int i,int j)
    {
    
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr,int lo, int hi)
    {
        int pivot=arr[lo],pidx=lo;
        int smallestcount=0;
        for(int i=lo+1;i<=hi;i++)
        {
            if(arr[i]<=pivot) smallestcount++;
        }
        int correctidx=pidx+smallestcount;
        swapping(arr,pidx,correctidx);

        int i=lo,j=hi;
        
        while(i<correctidx&&j>correctidx)
        {
        
         
            if(arr[i]<=pivot)  i++;
     
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot&&arr[j]<=pivot)
            {
                swapping(arr,i,j);
            } 
        }
            
         
            
        return correctidx;
        
    }
    public static void quickselect(int[] arr,int lo ,int hi,int k)
    {
        if(lo>hi) return;
    
        int idx=partition(arr,lo,hi);
        if(idx==k-1)
        {
            ans=arr[idx];
        }
        if(idx>k-1)  quickselect(arr,lo,idx-1,k);
        else quickselect(arr,idx+1,hi,k);
    }
    public static void main(String[] args) {
        int[] arr={4,8,2,1,5,9};
        int n=arr.length;
        print(arr);
        int k=2;
        ans=-1;
        quickselect(arr,0,n-1,n-k+1);//for kth largest element 
        quickselect(arr,0,n-1,k);//for kth smallest element 
        print(arr);
        System.out.println(ans);
    }
}


