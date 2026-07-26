class Solution {
    public int maxProduct(int n) {

            String str= String.valueOf(n);

            int result= Integer.MIN_VALUE;

                char []num= str.toCharArray();

            for(int i=0;i<num.length;i++){
                 for(int j=i+1;j<num.length;j++){
                    int a=num[i]-'0';
                    int b= num[j]-'0';
                    result= Math.max(result,a*b);
                 }


            }
            return result;
        
    }
}