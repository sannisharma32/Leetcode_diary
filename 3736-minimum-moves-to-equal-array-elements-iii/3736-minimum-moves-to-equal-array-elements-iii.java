class Solution {
    public int minMoves(int[] nums) {
       
            int max= nums[0];

            for(int e:nums){
                if(e>max){
                    max=e;
                }
            }

        int count=0;


        for(int i=0;i<nums.length;i++){
            count += max-nums[i];
        }
        
        return count;
        

    }
}