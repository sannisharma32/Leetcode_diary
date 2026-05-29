class Solution {
    public int numberOfSpecialChars(String word) {

        int[] lowers= new int [26];
        int []uppers= new int[26];
        Arrays.fill(lowers,-1);
        Arrays.fill(uppers,Integer.MAX_VALUE);
        int count=0;

        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);

            if(Character.isLowerCase(ch)){
                lowers[ch-'a']=i;
            }else{
                uppers[ch-'A']=Math.min(uppers[ch-'A'],i);
            }
        }

        for(int i=0;i<26;i++){
            if(lowers[i] != -1 && uppers[i] != Integer.MAX_VALUE && lowers[i]<uppers[i]){
                count++;
            }
        }

        return count;
        
        
    }
}