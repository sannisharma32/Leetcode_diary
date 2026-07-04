class Solution {
    public int minScore(int n, int[][] roads) {

        List<int[]>[] graph= new ArrayList[n+1];


        for(int i=0;i<=n;i++){
            graph[i]= new ArrayList<>();
        }
        for(int[]b: roads){
            int u=b[0];
            int v=b[1];
            int dist=b[2];

            graph[u].add(new int[]{v,dist});
            graph[v].add(new int[]{u,dist});
        }

        boolean[] visted=new boolean[n+1];

        return dfs(graph, 1, visted,Integer.MAX_VALUE);
    }

        int dfs(  List<int[]>[] graph, int node, boolean[]visted, int ans){


            visted[node]=true;

            for(int[]edgs:graph[node]){

                int next=edgs[0];
                int dis=edgs[1];

                ans=Math.min(dis,ans);


               if(!visted[next]){
                ans= dfs(graph,next, visted, ans);
               }

            }
            return ans;
        }




}