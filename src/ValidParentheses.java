public class ValidParentheses {
    public static boolean validParentheses(String str){
        for(int i=0; i<str.length(); i++){
            if(str.contains("[")&&str.contains("]")){
                return true;
            }else if(str.contains("{")&&str.contains("}")){
                return true;
            }else if (str.contains("(")&&str.contains(")")){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        System.out.println(  validParentheses("({)"));

    }
}
