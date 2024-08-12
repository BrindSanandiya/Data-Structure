import java.util.Scanner;
import java.util.Stack;

public class EvPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter expression");
        String st = sc.next();

        System.out.print("" + postfixEvaluation(st));
        sc.close();
    }

    static int Perform_operation(int op1, int op2, char ch) {
        int ans = 0;

        switch (ch) {
            case '+':
                ans = op1 + op2;
                break;
            case '-':
                ans = op1 - op2;
                break;
            case '/':
                ans = op1 / op2;
                break;
            case '*':
                ans = op1 * op2;
                break;
            case '^':
                ans = op1 ^ op2;
                break;
        }
        return ans;
    }

    static int postfixEvaluation(String expression) {
        Stack<Integer> s1 = new Stack<>();
        int op2;
        int op1;
        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                s1.push(Integer.parseInt(ch + ""));
            } 
            else{
                op2 = s1.pop();
                op1 = s1.pop();

                int value = Perform_operation(op1, op2, ch);
                s1.push(value);
            }
        }
        return s1.pop();
    }
}
