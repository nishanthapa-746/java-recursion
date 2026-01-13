public class reverseofstring{
    public static void main(String args[]){
     String str = "nishan";
     printstr(str,str.length()-1);  // -1 because index start from 0.
    }

    public static void printstr(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printstr(str,idx-1);
    }
}