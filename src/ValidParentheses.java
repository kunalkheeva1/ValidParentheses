public class ValidParentheses {
    public static boolean validParentheses(String str){
        char [] first = str.toCharArray();

        for(int i= 0; i<first.length; i++){
           if(first.length%2!=0){
               return false;
           }
            if((first[i]=='['&&first[i+1]==']')||(first[i]=='{'&&first[i+1]=='}')||(first[i]=='('&&first[i+1]==')')){
                return true;
            }
        }return false;

    }

    public static void main(String[] args) {
        System.out.println(  validParentheses("[){"));

    }
}
