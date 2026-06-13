class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        String result="";
        for(String word: words){

            char[] charactor= word.toCharArray();
            int index=0;
            for(char ch: charactor){
                int n= weights[ch-'a'];

                index+=n;
            }

            int mod= index%26;
            char c= (char)('z'-mod);
            
            result+=c;


        }
        return result;
        
    }
}