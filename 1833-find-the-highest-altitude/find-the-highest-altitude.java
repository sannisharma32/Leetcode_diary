class Solution {
    public int largestAltitude(int[] gain) {

        int maxaltutude=0;
        int sum=0;
        
        for(int g:gain ){
            sum+=g;
            maxaltutude =Math.max(maxaltutude,sum);
        }
        return maxaltutude;
    }
}