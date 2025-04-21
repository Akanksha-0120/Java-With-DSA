import java.util.Arrays;
public class methodarr {
    public static void main(String[] args) {
        int[] arr={17,24,9,43,57,38,5};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("after sorting:");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
