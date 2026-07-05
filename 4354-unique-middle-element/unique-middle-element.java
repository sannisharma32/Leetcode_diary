class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int n= nums.length-1;

        int mid=n/2;

        for(int i=0;i<=n;i++){

            if(nums[mid] == nums[i] && mid!=i){
                return false;
            }

        }

        return true;
        

       
        
    }
}