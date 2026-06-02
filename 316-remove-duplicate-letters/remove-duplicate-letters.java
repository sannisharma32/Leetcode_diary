class Solution {
    public String removeDuplicateLetters(String s) {

        int[] lastindex= new int [26];
        boolean[] visted= new boolean[26];
        Stack<Character>stack= new Stack<>();
        for(int i =0;i<s.length() ;i++){
            lastindex[s.charAt(i)-'a']=i;

        }

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            if(visted[ch-'a']){
                continue;
            }

            while(!stack.empty() && stack.peek()>ch && lastindex[stack.peek()-'a']>i){

                visted[stack.pop()-'a']=false;
            }

            stack.push(ch);
            visted[ch-'a']=true;


        }

        StringBuilder str= new StringBuilder();

        for(char ch :stack){
            str.append(ch);
        }

        return str.toString();
         


    }
}