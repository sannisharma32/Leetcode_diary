class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n= A.length;
        
        int[] feq= new int[n+1];
        int []ans= new int[n];

        int common=0;

        for(int i=0;i<n;i++){

            feq[A[i]]++;
            
            if(feq[A[i]]==2){
                common++;
            }

             feq[B[i]]++;
            
            if(feq[B[i]]==2){
                common++;
            }

            ans[i]=common;



        }
        return ans;
        
    }
}
