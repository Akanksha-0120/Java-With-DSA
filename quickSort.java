public class quickSort {
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
    public static void quicksort(int[] arr,int lo ,int hi)
    {
        if(lo>hi) return;
        int idx=partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr={4,8,7,2,1,5,3,9};
        int n=arr.length;
        print(arr);

        quicksort(arr,0,n-1); 
        print(arr);
    }
}
