public class rotatearr {
    public static void reverse(int[] arr,int i,int j)
    {
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    public static void main(String[] args){
       int[] arr={10,50,30,80,20,70};
         int k=5;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        System.out.print(arr);
        
    }
}
