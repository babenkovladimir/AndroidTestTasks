import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBracket {

    public static void main(String[] args) {
        int count = 0;
        boolean rez = true;
        char[] expression=null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter expression :");
            String exp = br.readLine();
            expression=exp.toCharArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (char c : expression) {
            if (c == '(') count++;
            if (c == ')') count--;
            if (count < 0) rez = false;
        }

        if (!(count == 0)) rez = false;
        System.out.println("Expression - " + rez);
    }
}
