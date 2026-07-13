class Solution {
    public List<Integer> sequentialDigits(int low, int high) {


        List<Integer>list= new ArrayList<>();

        int lowlen= String.valueOf(low).length();
        int highlen= String.valueOf(high).length();

        String dight="123456789";


        for(int i=lowlen; i<=highlen;i++){

            for(int j=0;j+i<=dight.length();j++){

                String substr= dight.substring(j,j+i);

                int num= Integer.parseInt(substr);

                if(num>=low && num<=high){
                    list.add(num);
                }


            }
        }

        return list;


        
        
    }
}