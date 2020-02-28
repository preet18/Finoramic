public class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)!=')'){
                stack.push(A.charAt(i));
            }else{
                char top = stack.pop();
                int redundantBraces = 1;
                while(top!='('){
                    if(top=='*'||top=='/'||top=='+'||top=='-'){
                        redundantBraces = 0;
                    }
                    top = stack.pop();
                }
                if(redundantBraces==1){
                    return redundantBraces;
                }
            }
        }
        return 0;
    }
}
