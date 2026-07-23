class Solution {
    public void wiggleSort(int[] nums) {

        int n= nums.length;

        int[]shorted= nums.clone();
        Arrays.sort(shorted);

        int left=(n-1)/2;
        int right= n-1;

        for(int i=0;i<n;i++){

        
        if(i %2==0){
            nums[i]=shorted[left--];
        }else{
            nums[i]= shorted[right--];
        }   
    }  

    }
}