class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {


        int ans= Integer.MAX_VALUE;
        int finsh1= calc(landStartTime,landDuration,waterStartTime,waterDuration);

        int finsh2=calc(waterStartTime,waterDuration,landStartTime,landDuration);

        return Math.min(finsh1,finsh2);
    }

    static  int calc(int[]firststart, int[]firstduration, int []secondStart, int []secondduration){

        int mine= Integer.MAX_VALUE;

        for(int i=0 ; i<firststart.length; i++){

            mine=Math.min(mine,firststart[i]+firstduration[i]);

        }

        int ans= Integer.MAX_VALUE;

        for(int i=0;i<secondStart.length;i++){
            int finss= Math.max(mine,secondStart[i])+secondduration[i];

            ans= Math.min(ans,finss);
        }
        return ans;


    }
}