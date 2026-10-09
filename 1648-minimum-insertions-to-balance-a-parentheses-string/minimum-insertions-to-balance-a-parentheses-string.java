class Solution {
    public int minInsertions(String s) {

        int open=0;
        int insert=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
            open++;
        
            }else{

            if(i+1 < s.length() && s.charAt(i+1)==')'){
                if(open>0){
                    open--;
                }else{
                    insert++;
                }
                i++;
                 }else{
                if(open>0){
                    open--;
                    insert++;
                }else{
                    insert +=2;
                }

            }
            }

        }

        return insert + 2*open;
        
    }
}