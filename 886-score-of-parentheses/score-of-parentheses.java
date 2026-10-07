class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer>stack= new Stack<>();
        stack.push(0);

        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(0);

            }else{

                int ineer= stack.pop();

                int score= (ineer==0)?1 : ineer*2;

                stack.push(stack.pop()+score);
                
            }
        }

            return stack.pop();
    }
}