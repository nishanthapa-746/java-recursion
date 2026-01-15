

public class removduplicate{
    public static void main(String[] args) {
        String str = "nishan";
        removedup(str,0,"");
        
    }

    public static boolean[] map = new boolean[26];

    public static void removedup(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.print(newString);
            return;
        }

        char currchar = str.charAt(idx);

        if(map[currchar -'a']){
            removedup(str, idx+1, newString);
        }else{
            newString += currchar;
            map[currchar - 'a'] = true;
            removedup(str,idx+1,newString);
        }

    }
}