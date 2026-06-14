import java.util.*;

public class parenthesis {
    static List<String> l = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        par("", 0, 0, n);
        return l;
    }

    public static void par(String c, int open, int close, int n) {

        // goal
        if (open == n && close == n) {
            l.add(c);
            return; // stop bro
        }
        // constraint

        if (open < n) {
            par(c + "(", open + 1, close, n);
        }
        if (close < open) {
            par(c + ")", open, close + 1, n);
        }

    }

    public static void main(String[] args) {
        parenthesis ob = new parenthesis();
        System.out.print(ob.generateParenthesis(5));
    }
}
