class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0){
            return 0;
        }
        int n = grid[0].length;
        int res = 0;
        int[] x = new int[] {-1, 1, 0, 0};
        int[] y = new int[] {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1'){
                    grid[i][j] = '0';
                    res++;
                    queue.offer(new int[]{i,j});
                    while(!queue.isEmpty()){
                        int[] q = queue.poll();
                        for(int z = 0;z<4;z++){
                            int newX = q[0]+x[z];
                            int newY = q[1]+y[z];
                            if(newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == '1'){
                                grid[newX][newY] = '0';
                                queue.offer(new int[]{newX,newY});
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}