class Solution {
    public int maximumProduct(int[] nums) {

        int largest= Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;


        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                third=second;
                second=largest;
                largest=nums[i];

            }else if(nums[i]>second && second != largest){
                third=second;
                second=nums[i];
            }else if(nums[i]>third &&  third != second){
                third=nums[i];
            }

            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<min2){
                min2=nums[i];

            }

        }
        return Math.max(largest*second*third , largest*min1*min2);

    }
}