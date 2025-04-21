import java.util.Scanner;
public class checksortedarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[100];
        boolean flag=true;      //means sorted
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
           if(arr[i]>arr[i+1])
           {
            flag=false;
             break;
           }
        }
        if(flag==true)   System.out.println("sorted");
        else  System.out.println("unsorted");
    }
}
