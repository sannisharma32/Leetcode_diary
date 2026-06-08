class Solution {
    public int[] pivotArray(int[] nums, int pivot) { 
        int n= nums.length;
        
        int []temp= new int[n];
        int j=0;

        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                temp[j++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                temp[j++]=nums[i];
            }
        }
         for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                temp[j++]=nums[i];
            }
        }
        
        return temp;


    }
}