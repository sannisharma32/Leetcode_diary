class Solution {
    public int totalWaviness(int num1, int num2) {  
        
        int result=0;
        for(int i=num1 ;i<=num2;i++){
            result+= waviness(i);
        }
        return result;
        
    }


    int waviness(int num){

        char[]ch= String.valueOf(num).toCharArray();

        if(ch.length<3){
            return 0;
        }
        int count=0;

        for(int i=1;i<ch.length-1;i++){
            if(ch[i]>ch[i-1] && ch[i]>ch[i+1] ||
                ch[i]<ch[i-1] && ch[i]<ch[i+1] 
            ){
                count ++;
            }
        }
        return count;


    }
}