class Solution {
    

    int gcd(int a, int b){
        while(b!=0){
            int temp= b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {

        int n= nums.length;

        int [] prefixgcd= new int[n];

        prefixgcd[0]=nums[0];
        int maxnum=nums[0];

        for(int i=1;i<n;i++){
            maxnum= Math.max(maxnum,nums[i]);
            prefixgcd[i]=gcd(maxnum,nums[i]);
        }

      


        Arrays.sort(prefixgcd);

        int left=0;
        int right=prefixgcd.length-1;

        long ans=0;
        while(left < right){
            ans+=gcd(prefixgcd[left],prefixgcd[right]);
            left++;
            right--;

        }

        return ans;




        
    }
}