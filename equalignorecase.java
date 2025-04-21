public class equalignorecase {
    public static void main(String[] args) {
         String s="hello";
         String str="HELLO";
         String st="hii";
         System.out.println(s.equalsIgnoreCase(str));
         System.out.println(str.equalsIgnoreCase(st));
    }
}
//equalsignorecase methods compare two string ,ignoring case difference(lower&uper case)