学习笔记

不同路径2：
dp[i][j] 表示走到格子 (i, j)(i,j) 的方法数

int m = obstacleGrid.length, n = obstacleGrid[0].length;
int[][] dp = new int[m][n];
for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
    dp[i][0] = 1;
	}
for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
    dp[0][j] = 1;
	}

