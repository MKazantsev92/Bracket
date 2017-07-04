import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Mihail.Kazantsev on 04.07.2017.
 * My first test sample
 * My first change in src
 * My second change in src
 */
public class Bracket {

    public static void main(String args[]) {

        Stack<Character> stack = new Stack<>();
        int flg = 0;

        Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
        do {
            char ch = sc.next().charAt(0);
            char bucket;
            if ( ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if ( ch == ')' && stack.peek() == '(' ) {
                stack.pop();
            }
            else if ( ch == '}' && stack.peek() == '{' ) {
                stack.pop();
            }
            else if ( ch == ']' && stack.peek() == '[' ) {
                stack.pop();
            }
            else {
                //System.out.println("Wrong bracket: ");
                flg = 1;
                //System.out.println("stack.peek = '" + stack.peek() + "', ch = '" + ch + "'");
                //stack.pop();
            }
            //System.out.println(stack);
        }
        while ( !( stack.empty() || flg != 0 ) );
        if ( flg == 0 ) {
            System.out.println("success");
        }
        else {
            System.out.println("failed");
        }
    }
}
