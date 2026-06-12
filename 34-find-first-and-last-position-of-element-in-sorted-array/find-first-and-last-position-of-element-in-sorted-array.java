class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int f= first(nums,target);
        int s= second(nums,target);
        return  new int[]{f,s};        
        
 
    }

    static int first(int[] nums, int target){
         int left=0 , right= nums.length-1;
        int ans=-1;

        while(left<=right){
            
            int mid= left+(right-left)/2;

            if(nums[mid]==target){
                right=mid-1;
                ans=mid;
            }else if(nums[mid]<target){
                left=mid+1;

            }else{
                right=mid-1;
            }
        }
        return ans;
    }
     static int second(int[] nums, int target){
         int left=0 , right= nums.length-1;
        int ans=-1;

        while(left<=right){
            
            int mid= left+(right-left)/2;

            if(nums[mid]==target){
                left=mid+1;
                ans=mid;
            }else if(nums[mid]<target){
                left=mid+1;

            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}