import java.util.List;
import java.util.ArrayList;

public class subset {
    static List<Integer> l = new ArrayList<Integer>();
    static int s = 0;

    public static void main(String[] args) {
        int sum = 10;
        int[] ar = { 1, 1, 2, 3, 4, 6, 7, 8 };
        sub(ar, 0, sum);

    }

    public static void sub(int[] ar, int n, int sum) {
        // goal
        if (n == ar.length) {
            return;
        }

        // constraint
        if (s > sum) {
            return;
        }

        // backtrack

        l.add(ar[n]);
        s = s + ar[n];
        if (s == sum) {
            System.out.println(l);
        }
        sub(ar, n + 1, sum);

        l.remove((Integer) ar[n]);
        s -= ar[n];
        sub(ar, n + 1, sum);

    }

}
