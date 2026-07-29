class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int sum=0;
        for(int e:nums){
            sum+=e;
        }

        int total= n*(n+1)/2;

        return total-sum;


        
    }
}