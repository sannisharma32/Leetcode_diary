class Solution {
    public String smallestSubsequence(String s) {

        int[]lastIndex = new int[26];
        int n= s.length();
        for(int i=0;i<n;i++){
            lastIndex[s.charAt(i)-'a']=i;
        }

        boolean[]visted= new boolean[26];

        Stack<Character>stack= new Stack<>();

        for(int i=0;i<n;i++){
            char ch= s.charAt(i);


            if(visted[ch-'a']){
                continue;
            }

            while(!stack.empty()&& stack.peek()> ch && lastIndex[stack.peek()-'a']>i){
                visted[stack.pop()-'a']=false;

            }

            stack.push(ch);
            visted[ch-'a']=true;


        }

        StringBuilder result= new StringBuilder();

        for(char ch: stack){
            result.append(ch);


        }

        return result.toString();


        
    }
}