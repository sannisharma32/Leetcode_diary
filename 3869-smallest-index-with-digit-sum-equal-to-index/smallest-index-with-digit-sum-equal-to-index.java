class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int ele=nums[i];
            while(ele>0){
                int dight= ele%10;
                sum+=dight;
                ele/=10;
            }
            if(sum==i){
                return sum;
            }
        }
        return -1;
        
    }
}