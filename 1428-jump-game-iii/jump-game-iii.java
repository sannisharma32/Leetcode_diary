class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[]visted= new boolean[arr.length];
         return dfs(arr, start, visted);
        
    }

    boolean dfs(int []arr, int index, boolean []visted){
        if(index<0 || index >= arr.length){
            return false;
        }

        if(visted[index]){
            return false;
        }

        if(arr[index]==0){
            return true;
        }
        visted[index]=true;


         return dfs(arr, index+arr[index], visted) ||  dfs(arr, index-arr[index], visted);


    }
}