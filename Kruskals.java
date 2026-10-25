public class kruskals {
    public static void main(String[] args){
        int n=4;
        int[][] edge={{0,1,10},{0,2,6},{0,3,5},{1,3,15},{2,3,4}};
        int e=edge.length;
        for(int i=0;i<e-1;i++){
            for(int j=0;j<e-i-1;j++){
                if(edge[j][2]>edge[j+1][2]){
                    int[] temp=edge[j];
                    edge[j]=edge[j+1];
                    edge[j+1]=temp;
                }
            }
        }
        int[] parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int count=0,cost=0;
        System.out.println("Edges in Minimum Spanning Tree:");
        for(int i=0;i<e&&count<n-1;i++){
            int u=edge[i][0],v=edge[i][1],w=edge[i][2];
            int p1=u,p2=v;
            while(parent[p1]!=p1){
                p1=parent[p1];
            }
            while(parent[p2]!=p2){
                p2=parent[p2];
            }
            if(p1!=p2){
                System.out.println(u+" - "+v+" : "+w);
                parent[p1]=p2;
                cost+=w;
                count++;
            }
        }
        System.out.println("Minimum Cost="+cost);
    }
}