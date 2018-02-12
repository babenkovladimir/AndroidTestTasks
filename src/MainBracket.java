import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainBracket {

    public static void main(String[] args) {
        String exp = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter expression :");
            exp = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Expression by count- " + checkByCount(exp));
        System.out.println("Expression by stack- " + checkByStack(exp));
    }

    private static boolean checkByStack(String string) {
        boolean rez = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(1);//start value

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') stack.push(1);
            if (string.charAt(i) == ')') stack.pop();
        }
        if (stack.empty() || stack.size() > 1) rez = false;

        return rez;
    }

    private static boolean checkByCount(String exp) {
        int count = 0;
        boolean rez = true;
        char[] expression = exp.toCharArray();

        for (char c : expression) {
            if (c == '(') count++;
            if (c == ')') count--;
            if (count < 0) rez = false;
        }

        if (!(count == 0)) rez = false;
        return rez;
    }
}
