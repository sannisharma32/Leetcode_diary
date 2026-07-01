class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

       int aliceSizesSum=0;
       int bobSizesSum=0;

       for(int n:aliceSizes){
        aliceSizesSum+=n;

       }
       for(int n:bobSizes){
        bobSizesSum+=n;


       }

       Set<Integer>set= new HashSet<>();

       int diff= (bobSizesSum-aliceSizesSum)/2;

       for(int x:bobSizes){

        set.add(x);

       }

       for(int x:aliceSizes){
        int need=x+diff;
        if(set.contains(need)){
            return new int[]{x,need};
        }
       }
       return new int[]{};

        
    }
}