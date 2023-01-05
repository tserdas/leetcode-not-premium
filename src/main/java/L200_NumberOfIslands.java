public class L200_NumberOfIslands {
    public static void main(String[] args) {
        char[][] ex = new char[][]{{'0','1','0'},{'1','0','1'},{'0','1','0'}};
        System.out.println(numIslands(ex));
    }
    public static int numIslands(char[][] grid){
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    ++count;
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        int[] h = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] v = new int[]{-1,0,1,-1,1,-1,0,-1};
        visited[i][j]=true;

        for(int x=0;x<h.length;x++){
            if(isSafe(grid,i+h[x],j+v[x],visited))
                dfs(grid,i+h[x],j+v[x],visited);
        }
    }

    private static boolean isSafe(char[][] grid, int i, int j, boolean[][] visited) {
        return (i>=0) && (i<grid.length) && (j>=0) && (j<grid[0].length) && (grid[i][j]=='1') && !visited[i][j];
    }

}
