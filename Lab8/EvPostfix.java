
import java.util.Scanner;
import java.util.Stack;

public class EvPostfix {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String exp = sc.nextLine();
        int TOP = 0;
        int value = 0;

        exp = exp + " ";
        while (exp.charAt(value) != ' ') {
            if (Character.isDigit(exp.charAt(value))) {
                st.push(Integer.valueOf("" + exp.charAt(value)));
            } else {
                int op1 = st.pop();
                int op2 = st.pop();
                int ans = 0;
                if (exp.charAt(value) == '+') {
                    ans = op1 + op2;
                }
                if (exp.charAt(value) == '-') {
                    ans = op1 - op2;
                }
                if (exp.charAt(value) == '*') {
                    ans = op1 * op2;
                }
                if (exp.charAt(value) == '/') {
                    ans = op1 / op2;
                }
                if (exp.charAt(value) == '^') {
                    ans = (int) Math.pow(op2, op1);
                } else {
                    System.out.println("Invalid Expression");
                }
                st.push(ans);
            }
            value++;

        }
        if (st.size() == 1) {
            System.out.println(st.pop());
        }
    }

}
