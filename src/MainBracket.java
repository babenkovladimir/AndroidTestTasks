import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        checkByReplacing(exp);

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


    private static boolean checkByReplacing(String exp) {
        boolean rez = true;

        while (exp.length() > 2) {
            if (exp.contains("()")) {
                exp.replace("()", "");
                
            }
            System.out.println(exp.indexOf("()"));

        }

        return rez;
    }
}
