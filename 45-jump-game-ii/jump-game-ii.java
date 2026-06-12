class Solution {
    public int jump(int[] nums) {
        
        int jump=0;
        int curr=0;
        int fur=0;

        for(int i=0;i<nums.length-1;i++){
            fur= Math.max(fur,i+nums[i]);


            if(curr==i){
                jump++;
                curr=fur;
            }


        }
        return jump;

        
    }
}