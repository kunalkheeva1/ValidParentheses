import java.util.Stack;

public class ValidParentheses {

//creating a boolean method to check chars of my string
    public boolean isMatching(char a, char b){
       return (a=='(' && b==')') ||(a=='{' && b=='}')||(a=='[' && b==']');
    }
    //method to confirm it
    public boolean validParentheses(String str) {

        //first crate a stack to store the values
        Stack<Character> s = new Stack<>();
        //run a loop to the end char fo str.
        for(int i=0; i<str.length(); i++){
            //current char will be at i
            char current = str.charAt(i);
            //if it is opening bracket, then just push it to the stack for further confirmation
            if(current == '(' || current == '{' || current == '['){
                s.push(current);
            }
            //now, check if the stack is empty, where we are storing the current then return flase
            else if(s.empty()){
                return false;
            }
            //if they dont match then just return false, else pop the element out of the stack
            else if(!isMatching(s.peek(),current)){
                return false;
            }
            //if matches, pop the stored element out of the stack
            else{
                s.pop();
            }
            //and my empty stack will be returned,,,
        }return s.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses kk = new ValidParentheses();
        System.out.println( kk.validParentheses("{(())}"));


    }
}