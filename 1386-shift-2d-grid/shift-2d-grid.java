class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {


        int m= grid.length;
        int n= grid[0].length;

        List<Integer>list= new ArrayList<>();

        for(int[]row:grid){

            for(int val :row){
                list.add(val); 
            }
            
        }

        int size=list.size();

        k%=size;

        List<Integer>rotat= new ArrayList<>();

        for(int i=0;i<size;i++){
            rotat.add(list.get((i-k+size)%size));
        }


        List<List<Integer>>ans= new ArrayList<>();
        int index=0;

        for(int i=0;i<m;i++){
            List<Integer>row= new ArrayList<>();
            for( int j=0;j<n;j++){
                row.add(rotat.get(index++));
            }

            ans.add(row);
        }

        return ans;

        
    }
}