public class wave {
    public static void print(int[][] arr)
    {
        int m=arr.length,n=arr[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        int m=arr.length,n=arr[0].length;
        
       // for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        {
           // if(i%2==0)
           //if(i%2==1)

           // if(j%2==0)
            if(j%2==1)

            {
               // for(int j=0;j<n;j++)
                for(int i=0;i<m;i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                //for(int j=n-1;j>=0;j--)
                for(int i=m-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            
        }
    }
}
