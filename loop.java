public class loop {
    public static void main(String[] args) {
        int i=4,j=0;
        while(i>=0){
        i=i-1;
        j=j+1;
        if(i==j) 
        {
            continue;

        }
        else
        System.out.println(i+" "+j);
    }
    
  }
}
