class Solution {
    public int singleNumber(int[] nums) {

        int diff=0;

        for(int n:nums){
            diff^=n;
        }
        return diff;


       
        
    }
}