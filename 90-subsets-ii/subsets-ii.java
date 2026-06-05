class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>>result= new ArrayList<>();
         Arrays.sort(nums);

         backtraking(nums,0,result, new ArrayList<>());
         return result;

    }
    void backtraking(int[]nums,int index,  List<List<Integer>>result, ArrayList<Integer>curr){
        
            result.add(new ArrayList<>(curr));
           

        

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }

            curr.add(nums[i]);
            backtraking(nums,i+1,result,curr);
            curr.remove(curr.size()-1);

        }

    }

}