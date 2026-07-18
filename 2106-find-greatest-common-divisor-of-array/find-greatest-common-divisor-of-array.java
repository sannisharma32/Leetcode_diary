class Solution {

    int gcd(int a, int b){
        while(b!= 0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }


    public int findGCD(int[] nums) {
        
        int m=Integer.MIN_VALUE;
        int n= Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            m= Math.max(nums[i],m);
            n= Math.min(nums[i],n);
            
        }

        return gcd(m,n);



    }
}