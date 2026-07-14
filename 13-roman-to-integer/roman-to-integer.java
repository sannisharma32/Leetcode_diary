class Solution {

    int  value(char ch){
          switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int n= s.length();



        int result=0;

        for(int i=0;i<n;i++){
            int current= value(s.charAt(i));

            if(i+1<n && current<value(s.charAt(i+1))){
                result-= current;


            }else{
                result += current;
            }

        }

        return result;


        
    }
}