public class sumaaray {
    public static void main(String[] args) {
        int[] arr={ 23,43,62,47,39,56,73,11,94,34,67,};
        int n=arr.length;
        int sum=1;
        for(int i=0;i<n;i++)
        {
           //sum=sum+arr[i];
           sum=sum*arr[i];
        }
        System.out.print(sum);
    }
}
