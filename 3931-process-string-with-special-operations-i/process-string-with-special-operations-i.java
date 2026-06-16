class Solution {
    public String processStr(String s) {
        
        int n= s.length();
        StringBuilder result= new StringBuilder();

        for(int i=0;i<n;i++){
            char ch= s.charAt(i);

            if(ch>='a' && ch <='z'){
                result.append(ch);

            }else if(ch =='#'){
                result.append(result.toString());
            }else if(ch == '*'){
               if(result.length()>0){
                 result.deleteCharAt(result.length()-1);
               }
            }else if( ch== '%'){
            if(result.length()>0){
                result.reverse();
                
            }
            }
        }

        return result.toString();
        
    }
}