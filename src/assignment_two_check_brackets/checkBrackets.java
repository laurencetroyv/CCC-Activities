package assignment_two_check_brackets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        return this.type == '(' && c == ')';
    }

    char type;
    int position;
}

class CheckBrackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        String text = reader.readLine();

        Stack<Bracket> openingBracketsStack = new Stack<>();
        
        for (int index = 0; index < text.length(); ++index) {
            char next = text.charAt(index);

            if (openingBracket(next)) {
                openingBracketsStack.push(new Bracket(next, index));
            }

            if (closingBracket(next)) {
                // Process closing bracket, write your code here
                if (openingBracketsStack.isEmpty()) {
                    System.out.println(index + 1);
                    break;
                }

                Bracket top = openingBracketsStack.pop();
                
                if (!top.match(next)) {
                    System.out.println(index + 1);
                }
            }
        }
        
        // Printing answer, write your code here
        System.out.println(openingBracketsStack.isEmpty() ? "Success" : openingBracketsStack.peek().position + 1);
    }

    private static boolean openingBracket(char next) {
        return next == '(' || next == '[' || next == '{';
    }

    private static boolean closingBracket(char next) {
        return next == ')' || next == ']' || next == '}';
    }
}