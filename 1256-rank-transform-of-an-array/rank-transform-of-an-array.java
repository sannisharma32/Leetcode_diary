class Solution {
    public int[] arrayRankTransform(int[] arr) {


        if(arr.length==0){
            return arr;
        }

        Map<Integer,Integer>map= new HashMap<>();

        int[]sorted= arr.clone();

        Arrays.sort(sorted);
        
        int rank=1;
        
        for(int key: sorted){
            if(!map.containsKey(key)){
                map.put(key,rank++);
            }
        }


        int []ans= new int[arr.length];

        for(int i=0;i<ans.length;i++ ){
            ans[i]= map.get(arr[i]);
        }

        return ans;
       



        
    }
}