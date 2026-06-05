class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list= new ArrayList<>();
        backtraking(nums,0,list,new ArrayList<>());
        return list;

        
    }

    void backtraking(int[]nums, int index, List<List<Integer>>list, ArrayList<Integer>curr){

        if(index == nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);
        backtraking(nums,index+1,list,curr);
        curr.remove(curr.size()-1);
        backtraking(nums,index+1,list,curr);

    }





}