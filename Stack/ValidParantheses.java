package Java.Blind75.Stack;

import java.util.Stack;

public class ValidParantheses {

    public static boolean isValid (String s){
        Stack <String> stack = new Stack<>();
        String[] arr = s.split("");
        
        for (int i = 0; i < arr.length; i++){
            switch (arr[i]){
                case "(":
                    stack.push(arr[i]);
                    break;
                case "[":
                    stack.push(arr[i]);
                    break;
                case "{":
                    stack.push(arr[i]);
                    break;
                
                case ")":
                    if (stack.empty())
                        return false;
                    if (!(stack.peek().equals("(")))
                        return false;
                    else 
                        stack.pop();
                    break;
                case "]":
                    if (stack.empty())
                        return false;
                    if (!(stack.peek().equals("[")))
                        return false;
                    else 
                        stack.pop();
                    break;
                case "}":
                    if (stack.empty())
                        return false;
                    if (!(stack.peek().equals("{")))
                        return false;
                    else 
                        stack.pop();
                    break;
            }
            
        }
        if (!stack.empty())
                return false;

        return true;

    }
    public static void main(String[] args) {
        String s = "]";
        String s2 = "()";
        String s3 = "(]";

        System.out.println(isValid(s));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));

    }
}
