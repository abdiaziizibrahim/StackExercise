// Abdiaziz Ibrahim Aden
// C1240583

package Ch3;
import java.util.Stack;
// Exercise: Stack Operations
// Learn how to use the Stack data structure - Last In, First Out (LIFO).

public class StackExercises {
        public static void main(String[] args) {
            // TODO: 1 - Create a Stack of Strings called 'stack'
            Stack <String> MyStack = new Stack<>();
            System.out.println(MyStack.toString());
            // TODO: 2 - Push 5 elements onto the stack: "Java", "Python", "C++", "JavaScript", "Go"
           MyStack.push("Java");
           MyStack.push("Python");
           MyStack.push("C++");
           MyStack.push("JavaScript");
           MyStack.push("Go");
            System.out.println(MyStack.toString());
            System.out.println();




            // TODO: 3 - Peek at the top element without removing it

            //           Print the result (should be "Go")
            System.out.println("which is the top element in this Stack ?");
            System.out.println("the top element is : " +MyStack.peek());

            System.out.println();


            // TODO: 4 - Pop an element from the stack and print it
            //           Then print the stack to see the remaining elements
            System.out.println("remove one  element in the Stack!");
            System.out.println(MyStack.pop()+ " is removed");
            System.out.println();
            System.out.println("--After Pop---");
            System.out.println(MyStack.toString());
            System.out.println();



            // TODO: 5 - Check if the stack is empty using isEmpty()
            //           Print the result
            System.out.println("is this stack isEmpty ? ");
            System.out.println(MyStack.isEmpty());


            // --- String Reversal ---
            System.out.println("\n--- String Reversal ---");
            String original = "Hello World";
            // TODO: 6 - Use a Stack to reverse the string 'original'
            Stack<Character> charStack = new Stack<>();

            // Push each character into Stack
            for (int i = 0; i < original.length(); i++) {
                charStack.push(original.charAt(i));
            }

            // Pop characters to reverse the string
            String reversed = "";
//           Push each character onto a stack, then pop them all to build the reversed string
            while (!charStack.isEmpty()) {
                reversed += charStack.pop();
            }
            //           Print both original and reversed strings
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);


            // --- Balanced Brackets ---
            System.out.println("\n--- Balanced Brackets ---");
            String balanced = "({[()]})";
            String unbalanced = "({[})";
            // TODO: 7 - Implement a balanced brackets checker
            //           Use a Stack to check if a string of brackets is balanced
            //           For each char: if opening bracket, push it; if closing bracket, check
            //           that the top of stack is the matching opening bracket
            //           Test with both 'balanced' and 'unbalanced' strings
            //           Print whether each string is balanced or not

            System.out.println(balanced + " = " +
                    isBalanced(balanced));

            System.out.println(unbalanced + " = " +
                    isBalanced(unbalanced));
        }


    // Method to check Balanced Brackets
    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();


    }
    }


