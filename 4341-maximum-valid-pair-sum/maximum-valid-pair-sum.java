class Solution {
    public int maxValidPairSum(int[] nums, int k) {

        int best=nums[0];
        int ans= Integer.MIN_VALUE;

        for(int i=k;i<nums.length;i++){
            best= Math.max(best,nums[i-k]);

            ans= Math.max(ans, best+nums[i]);
        }

        return ans;
        
    }
}