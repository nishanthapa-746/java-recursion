public class subsequesnes {
    public static void main(String args[]){
        String str="nishan";
        subs(str,"",0);
    }

    public static void subs(String str,String newString,int idx){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currString = str.charAt(idx);
        subs(str,newString+currString, idx+1);

        subs(str,newString,idx+1);
        

    }
}
