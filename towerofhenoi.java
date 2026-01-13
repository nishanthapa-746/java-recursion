/* Theory

we have source, route and destination.

if we have 1 block then it direclty go from source to destination.

if we have 2 block in order of (a and b) then,
a---b
1st step a.(src)--------> (route).
2nd step b. src --------> destination.
3rd step a. route -------> destination.     a----b

 */

public class towerofhenoi {
    public static void main(String args[]) {
        int n = 5;
        henai(n, "S", "H", "D");
    }

    public static void henai(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transferring " + n + " from " + source + " to " + destination);
            return;
        }

        henai(n - 1, source, destination, helper);
        System.out.println("Transferring " + n + " from " + source + " to " + destination);
        henai(n - 1, helper, source, destination);
    }
}

// concept is very hard for higher value but it is easier to understand if you take value of n 1 and 2.
// write code for 1 and 2 and boom it works for all value. that is best part of this henai tower.