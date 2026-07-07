class Solution {
    public long sumAndMultiply(int n) {

        String str= String.valueOf(n);
        int sum=0;
        long x=0;

        for(char ch: str.toCharArray() ){

            

            if(ch != '0'){
                int dight= ch-'0';
                sum+=dight;
            x=x*10+dight;
            }

        }

        return  sum*x;

       
    }
}