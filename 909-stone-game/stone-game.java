class Solution {
    Integer[][]dp;
    public boolean stoneGame(int[] nums) {
        int n=nums.length;
        dp= new Integer[n][n];
        return solve(nums, 0,nums.length-1) > 0;
        
    }

    int  solve (int[]nums, int left, int right){

        if(left== right){
            return  nums[left];
        }

        if(dp[left][right]!= null){
            return dp[left][right];
        }

        int alice= nums[left]-solve(nums,left+1, right);

        int bob= nums [right]-solve(nums,left, right-1);

        return dp[left][right]= Math.max(alice,bob);





    }
}