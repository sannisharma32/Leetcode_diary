class Solution {
    public String smallestPalindrome(String s) {

        int[]feq= new int[26];

        for(int i=0;i<s.length();i++){
            feq[s.charAt(i)-'a']++;
        }

        StringBuilder left= new StringBuilder();
        String middel="";

        for(int i=0;i<26;i++){

            for(int j=0;j<feq[i]/2;j++){
                left.append((char)('a'+i));

            }

            if(feq[i]%2!= 0){
                middel=String.valueOf((char)('a'+i));
            }
            

        }

        String right= new StringBuilder(left).reverse().toString();

        return left.toString()+middel+right;
        
    }
}