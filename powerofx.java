
// finding the value of x ^n

public class powerofx{
    public static void main(String args[]){

        int x= 2;
        int n= 5;
        int ans=calpow(x,n);
        System.out.println(ans);
    }

    public static int calpow(int x, int n){
        //base value
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }

        //n is even

        if(n%2 == 0){
            return calpow(x,n/2) * calpow(x,n/2);
        } // if n is odd then it will apply this.
        else{
            return calpow(x, n/2) * calpow(x,n/2) * x ;
        }
    }
}