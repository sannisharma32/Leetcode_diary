class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>result= new ArrayList<>();

        for(int i=0;i<=rowIndex;i++){
            List<Integer>list= new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0|| j==i){
                    list.add(1);
                }else{
                    int value=result.get(i-1).get(j-1) 
                    + result.get(i-1).get(j);
                    list.add(value);
                }
               
            }
             result.add(list);
        }
        return result.get(rowIndex);



        
    }
}