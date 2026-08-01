class Solution {
    public boolean predictTheWinner(int[] nums) {

        return sol(nums , 0 ,nums.length-1)>=0;
        
    }

    int sol(int[]nums,int left, int right){
        if(left==right){
            return nums[left];
        }

        int leftsum= nums[left]-sol(nums,left+1,right);
        int rightsum=nums[right]-sol(nums,left,right-1);

        return Math.max(leftsum, rightsum);

    }
}