class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int n= landStartTime.length;
        int m=waterStartTime.length;

        int ans= Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){

                int landride= landStartTime[i]+landDuration[i];
                int finish1 =
    Math.max(landride, waterStartTime[j])
    + waterDuration[j];

                int waterride= waterStartTime[j]+ waterDuration[j];
                int finish2= Math.max(waterride, landStartTime[i])
    + landDuration[i];

                ans=Math.min(ans, Math.min(finish1,finish2));

            }
        }
        return ans;
        
    }
}