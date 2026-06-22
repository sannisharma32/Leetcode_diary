class Solution {
    public int maxNumberOfBalloons(String text) {

        int []feq= new int[26];

        for(char ch:text.toCharArray()){
            feq[ch-'a']++;
        }

        return Math.min(Math.min(feq['b'-'a'],feq['a'-'a']),
                        Math.min(
                            Math.min(feq['l'-'a']/2,feq['o'-'a']/2),
                            feq['n'-'a']
                            )
        
        );

        
        
    }
}