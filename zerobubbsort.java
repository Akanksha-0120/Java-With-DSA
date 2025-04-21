public class zerobubbsort {
    public static void print(int[] arr)
    {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,0,2,8,0,4,0,7};
        int n=arr.length;
        print(arr);
    
        for(int x=0;x<n-1;x++)
        {
            boolean flag=true;
            for(int i=0;i<n-1-x;i++)
            { 
                
                if(arr[i]==0)
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
    
                }
                
            }
            if(flag==true)  break;
        }
        System.out.println("after bubble sorting:");
        print(arr);
    
       } 
    }
    
    

