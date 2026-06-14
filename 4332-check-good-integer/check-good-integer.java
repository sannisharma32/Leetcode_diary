class Solution {
    public boolean checkGoodInteger(int n) {

        int digitSum=0;
        int squarSum=0;

        while(n>0){
            int digit= n%10;
            digitSum+= digit;
            squarSum =squarSum+(digit*digit);
            n/=10;
        }

        if((squarSum-digitSum)>=50){
            return true;
        }
        
        return false;
    }
}