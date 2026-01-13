// move all the x to the end of given string.

public class movextoend {
    public static void main(String args[]) {
        String str = "temxpicxturxttx";
        movend(str, 0, 0);
    }

    public static void movend(String str, int idx, int count) {
        if (idx == str.length()) {
            for (int i = 1; i <= count; i++) {
                System.out.print("x");
            }
            return;
        }

        if ((str.charAt(idx) != 'x')) {
            System.out.print(str.charAt(idx));
            movend(str, idx + 1, count);
        } else {
            count++;
            movend(str, idx + 1, count);

        }
    }
}
