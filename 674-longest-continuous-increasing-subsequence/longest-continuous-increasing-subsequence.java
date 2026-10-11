class Solution {
    public int findLengthOfLCIS(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        int length=1;
        int count=1;

        int l=0;
        int r=1;
        while(r < nums.length){
            if(nums[l] < nums[r]  ){
                count++;
            }else{
               
                count=1;
               
            }
              length= Math.max(count, length);
              
              r++;
              l++;

           
        }
        
        return length;

        

        
    }
}