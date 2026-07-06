class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=0;
        int m=intervals.length;
        int n= intervals[0].length;

        
        for(int i=0;i<m;i++){
            boolean cover=false;
            for(int j=0;j<m;j++){

                if(i==j){
                    continue;
                }
                if(intervals[j][0]<=intervals[i][0] &&
                    intervals[i][1]<=intervals[j][1]
                ){
                    cover=true;
                    break;
                }
                
            }
            if(!cover){
                count++;

            }
        }

        return count;
    }
}