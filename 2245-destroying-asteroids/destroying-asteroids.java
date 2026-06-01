class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);
        
        long cm= mass;
        for(int a:asteroids){
            

            if(cm<a){
                return false;
            }

            cm+=a;
        }
        return  true;
        
    }
}